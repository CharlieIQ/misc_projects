"use strict"
// For variables
const timedisplay = document.querySelector('.time')
const block = document.querySelector('.blocks');

// For displaying time
const d = new Date();
timedisplay.textContent = d.getDate() + "/"
+ (d.getMonth()+1)  + "/" 
+ d.getFullYear() + " @ "  
+ d.getHours() + ":"  
+ d.getMinutes() + ":" 
+ d.getSeconds();

block.addEventListener('click', function(){
    document.querySelector('.blocks').style.backgroundColor = '#ffffff';

})