const add_button = document.querySelector('.addbutton');
const subtract_button = document.querySelector('.subtractbutton');
const multiply_button = document.querySelector('.multiplybutton');
const divide_button = document.querySelector('.dividebutton');
const exponent_button = document.querySelector('.exponentbutton')
// const equalsCalculate = document.getElementById('equals');

// I was having issues with DOM and this is to test fixing it
const pageHeader = document.querySelector('.calcheader')
pageHeader.textContent = "Charlie Calculator";

// For adding numbers
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