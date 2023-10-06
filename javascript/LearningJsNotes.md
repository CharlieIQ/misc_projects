# JavaScript
*My personal notes*
## The Very Basics
### Hello World
Printing hello world to the console is simple.
```js
// Prints hello world
console.log("Hello world");
```
### Variables
Variables store data. There are 3 ways to declare variables in JavaScript: `var`, `const`, and `let`. Good coding practice is using let when you know the value of the variable will change, otherwise use const.

Data stored in `const` variables cannot be changed after declaration\ 
Data stored in `let` variables are able to be changed after declaration\ 
`var` variables are mostly out of date, and not reccomended for use.

JavaScript is a dynamically types language, meaning data types of variables are determined by the value they hold on runtime.
```js
const PI = 3.141;
let x = 10;
var y = 20;

console.log(PI);
console.log(x);
console.log(y);
```

### Operators
#### List of Mathematical Operators
- `+` for adding numbers together or concatenating strings
- `-` for subtracting one number from another
- `*` for multiplying numbers together
- `/` for dividing one number from another
- `**` for raising one number to the power of another
- `%` divides one number from another and returns the remainder
- `++` increments by 1
- `--` decrements by 1

```js
let x = 5 + 5;       // 10
let y = "5" + 5;     // 55
let z = "Hello" + 5; // Hello5
```

#### List of Logical Operators
- `&&` AND logic operator
- `||` OR logic operator
- `!` NOT logic operator

#### List of Comparison Operators 
- `==` equal value operator
- `===` equal value and type operator
- `!=` not equal to
- `!==` not equal value or not equal type
- `>` greater than
- `<` less than
- `>=` greater than or equal to
- `<=` less than or equal to
- `?` ternary operator\
Logic and comparison operators are crucial in making decisions in code.

### 8 Datatypes of JavaScript
1. String - Array of characters (Words)
2. Number - Any decimal, negative, or real number
3. Bigint - Numbers too large to be represented normally
4. Boolean - True or False (1 or 0)
5. Undefined - An undefined value 
6. Null - A non existing value
7. Symbol - A primitive data type
8. Object - An object created from a class

## Functions
### Creating Functions
Functions are blocks of code that can be called more than once. Functions can take arguments, and these arguments will turn into parameters to be used in the function. Functions can also return values. Functions improve code clarity and make code process easier to follow.

```js
function myFunction(parameter1, parameter2, parameter3){
    return parameter1 + parameter2 + parameter3;
}
x = myFunction(2, 3, 4);
y = myFunction(4, 4, 4);
console.log(x); // Will print 9
console.log(y); // Will print 12
```

### Default Values
What if a parameter isn't filled in? Java allows *default* values to be put in function parameters. 

In this case, only a value for x is put in the function. Since y is empty, it will default to 10 and return 10 + 5 (15),
```js
function myFunction(x, y = 10) {
  return x + y;
}
myFunction(5); // Will return 15
```

### Rest Parameter
The rest parameter (...) allows there to be an indeterminate number of parameters into a function. 

In this example, you can add as many arguments into the `sum()` function, and the function will still iterate over the values and sum them all.
```js
function sum(...args) {
  let sum = 0;
  for (let arg of args) sum += arg;
  return sum;
}

let x = sum(4, 9, 16, 25, 29, 100, 66, 77);
```