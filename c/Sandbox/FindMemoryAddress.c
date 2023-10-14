#include <stdio.h>
int main()
{
// memory = an array of bytes within RAM (the street)
// memory block = a single unit (byte) within memory (a house), used to hold some value (a person)
// memory address = the address of where a memory block is located (house address)
char a;
char b[2];
printf("%d bytes\n", sizeof(a));
printf("%d bytes\n", sizeof(b));
printf("%p\n", &a);
printf("%p\n", &b);
printf("%p\n", &b[1]);
return 0;
}
