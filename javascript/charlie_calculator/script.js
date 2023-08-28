/*
I made this as a personal project to work on when I am bored
This probably isn't clean but I don't care 😂
*/
'use strict';
// Variables for all of the basic operator buttons on page
const add_button = document.querySelector('.addbutton');
const subtract_button = document.querySelector('.subtractbutton');
const multiply_button = document.querySelector('.multiplybutton');
const divide_button = document.querySelector('.dividebutton');
const exponent_button = document.querySelector('.exponentbutton')
const modulus_button = document.querySelector('.modulusbutton')
// For single number operations
const square_button = document.querySelector('.squarebutton');
const cube_button = document.querySelector('.cubebutton');
// For equation solver
const equation = document.querySelector('.equationinput');
// All of the basic operations
// For adding button
add_button.addEventListener('click', function (e) {
    // Gets the numbers inputted
    let number1 = Number(document.querySelector('.numberinputone').value);
    let number2 = Number(document.querySelector('.numberinputtwo').value);

    e.preventDefault() // Prevents refresh
    let sum = number1 + number2; // Adds numbers together 
    document.querySelector('.result').textContent = sum;
});

// For subtract button
subtract_button.addEventListener('click', function (e) {
    // Gets the numbers inputted
    let number1 = Number(document.querySelector('.numberinputone').value);
    let number2 = Number(document.querySelector('.numberinputtwo').value);

    e.preventDefault() // Prevents refresh
    let difference = number1 - number2; // Subtracts the 2 numbers 
    document.querySelector('.result').textContent = difference;
});

// For multiply button
multiply_button.addEventListener('click', function (e) {
    // Gets the numbers inputted
    let number1 = Number(document.querySelector('.numberinputone').value);
    let number2 = Number(document.querySelector('.numberinputtwo').value);
    
    e.preventDefault() // Prevents refresh
    let product = number1 * number2; // Multiplies numbers together 
    document.querySelector('.result').textContent = product;
});

// For divide buttons
divide_button.addEventListener('click', function (e) {
    // Gets the numbers inputted
    let number1 = Number(document.querySelector('.numberinputone').value);
    let number2 = Number(document.querySelector('.numberinputtwo').value);

    e.preventDefault() // Prevents refresh
    let quotient = number1 / number2; // Divides the numbers
    document.querySelector('.result').textContent = quotient;
});

// For exponent button
exponent_button.addEventListener('click', function (e) {
    // Gets the numbers inputted
    let number1 = Number(document.querySelector('.numberinputone').value);
    let number2 = Number(document.querySelector('.numberinputtwo').value);

    e.preventDefault() // Prevents refresh
    let exponent = number1 ** number2; // Raises numebr one to the power of number 2
    document.querySelector('.result').textContent = exponent;
});

// For modulus button
modulus_button.addEventListener('click', function (e) {
    // Gets the numbers inputted
    let number1 = Number(document.querySelector('.numberinputone').value);
    let number2 = Number(document.querySelector('.numberinputtwo').value);

    e.preventDefault() // Prevents refresh
    let modulus = number1 % number2; // Perfomns modulus operation
    document.querySelector('.result').textContent = modulus;
});
 
// Single number operations
square_button.addEventListener('click', function (e) {
    // Gets the numbers inputted
    let singlenumber = Number(document.querySelector('.singlenuminput').value);

    e.preventDefault() // Prevents refresh
    let square = singlenumber ** 2; // Perfomns modulus operation
    document.querySelector('.resultsingle').textContent = square;
});

cube_button.addEventListener('click', function (e) {
    // Gets the numbers inputted
    let singlenumber = Number(document.querySelector('.singlenuminput').value);

    e.preventDefault() // Prevents refresh
    let cube = singlenumber ** 3; // Perfomns modulus operation
    document.querySelector('.resultsingle').textContent = cube;
});


let userInput = "4+4";

function inputParser(expression_input){
    let operator = expression_input.search(/[+,-,/,*]/i);
    // Will return the operator in uder input if found
    return String(expression_input.slice(operator, operator+1));
} 

class Operations {
    constructor(numberone, numbertwo){
        this.numberone = numberone;
        this.numbertwo = numbertwo
        this.operator = operator
    }
    add(){
        let add = this.numberone + this.numbertwo;
        return add;
    }
    subtract() {
        let subtract = this.numberone - this.numbertwo;
        return subtract
    }
    multiply(){
        let multiply = this.numberone * this.numbertwo;
        return multiply;
    }
    divide() {
        let divide = this.numberone / this.numbertwo;
        return divide
    }
}

console.log(inputParser(userInput));

