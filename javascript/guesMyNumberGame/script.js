'use strict';
// I made this for my Udemy JavaScript course top learn about DOM 

// For the score numbers and secret number
let secretNumber = Math.trunc(Math.random() * 20) + 1;
let score = 20;
let highscore = 0;

document.querySelector('.number').textContent = '?';
const againButton = document.querySelector('.again')
// For when the Check! button is clicked
const buttonClick = document.querySelector('.check');
buttonClick.addEventListener('click', function () {
    const guess = Number(document.querySelector('.guess').value);

    // When guess is empty
    if (!guess) {
        document.querySelector('.message').textContent = 'No number!';

        // When player wins
    } else if (guess === secretNumber) {
        document.querySelector('.message').textContent = 'Correct Number!';

        document.querySelector('.number').textContent = secretNumber;
        // For win styles
        document.querySelector('body').style.backgroundColor = '#60b347';
        document.querySelector('.number').style.width = '30rem';

        if (score > highscore) {
            highscore = score;
            document.querySelector('.highscore').textContent = highscore;
        }

        // When guess is too high
    } else if (guess > secretNumber) {
        if (score > 1) {
            document.querySelector('.message').textContent = 'Guess too high!';
            score--;
            document.querySelector('.score').textContent = score;
        } else {
            document.querySelector('.message').textContent = 'You lost the game';

        }

        // When guess is too low
    } else if (guess < secretNumber) {
        if (score > 1) {
            document.querySelector('.message').textContent = 'Guess too low!';
            score--;
            document.querySelector('.score').textContent = score;
        } else {
            document.querySelector('.message').textContent = 'You lost the game';

        }
    }
});

againButton.addEventListener('click', function () {
    score = 20
    secretNumber = Math.trunc(Math.random() * 20) + 1;
    document.querySelector('.score').textContent = 20;
    document.querySelector('.number').textContent = '?';
    document.querySelector('.guess').value = '';

    document.querySelector('body').style.backgroundColor = '#222';
    document.querySelector('.number').style.width = '15rem';
});