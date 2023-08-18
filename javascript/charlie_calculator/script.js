/*
I made this as a personal project to work on when I am bored
*/

// Variables for all of the buttons on page
const add_button = document.querySelector('.addbutton');
const subtract_button = document.querySelector('.subtractbutton');
const multiply_button = document.querySelector('.multiplybutton');
const divide_button = document.querySelector('.dividebutton');
const exponent_button = document.querySelector('.exponentbutton')
const modulus_button = document.querySelector('.modulusbutton')

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