const add_button = document.getElementsByClassName('addButton')[0];
const subtract_button = document.getElementsByClassName('subtractButton');
const multiply_button = document.getElementsByClassName('multiplyButton');
const divide_button = document.getElementsByClassName('divideButton');
// const equalsCalculate = document.getElementById('equals');

const pageHeader = document.getElementsByClassName('.calcHeader')
pageHeader.innerText = "test please work!!!";

let number1 = Number(document.getElementsByClassName('numberInputOne').value);
let number2 = Number(document.getElementsByClassName('numberInputTwo').value);

add_button.addEventListener('click', function () {
    let sum = number1 + number2;
    document.getElementsByClassName('result').textContent = sum;
});

