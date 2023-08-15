const add_button = document.querySelector('.add');
const subtract_button = document.querySelector('.subtract');
const multiply_button = document.querySelector('.multiply');
const divide_button = document.querySelector('.divide');
// const equalsCalculate = document.getElementById('equals');

let number1 = Number(document.querySelector('.numberInputOne').value);
let number2 = Number(document.querySelector('.numberInputTwo').value);

add_button.addEventListener('click', function () {
    let sum = number1 + number2;
    document.querySelector('.result').textContent = sum;
});