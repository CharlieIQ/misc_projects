#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_STR_LEN 1024
#define MIN_ASCII 32
#define MAX_ASCII 126

int main(int argc, char* argv[]) {
    // Check that there are two inputs on the command line. If not, abort.
    if (argc != 3) {
        printf("Usage: ./caesarcypher <string> <offset>\n");
        return 1;
    }

    // Ensures that a very long string doesn't cause trouble later
    if (strlen(argv[1]) >= MAX_STR_LEN){
        printf("String length is too long.\n");
        return 1;
    }

    // Make a copy of the first command line argument into a string variable
    char input_str[MAX_STR_LEN];
    strncpy(input_str, argv[1], MAX_STR_LEN);

    // Read the second argument as a string and converts to an integer
    int offset = atoi(argv[2]);

    // Validate that the offset is within some boundaries
    if (offset < -10 || offset > 10) {
        printf("Offset should be between -10 and 10\n");
        return 1;
    }
    // The logic of the cypher begins here ///////////////////////////////////

    int range = MAX_ASCII - MIN_ASCII + 1; // ASCII printable characters range

    // Two useful variables for encoding
    unsigned char original_char;
    unsigned char cypher_char;

    for (int i = 0; input_str[i] != '\0'; i++) {
        // Bloc 1:
        original_char = input_str[i];

        // Bloc 2:
        if (original_char < MIN_ASCII || original_char > MAX_ASCII) {
            continue; // ignore non-printable characters
        }

        // Bloc 3:
        cypher_char = original_char + offset;

        // Bloc 4:
        if (cypher_char > MAX_ASCII) {
            cypher_char = cypher_char - range;
        }
        else if (cypher_char < MIN_ASCII){
            cypher_char = cypher_char + range;
        }

        // Bloc 5:
        input_str[i] = cypher_char;
    }

    // Print Ciphered String
    printf("Ciphered string: %s\n", input_str);

    //
    // The logic of the cypher ends here /////////////////////////////////////

    return 0;
}
