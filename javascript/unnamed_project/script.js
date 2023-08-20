"use strict"
// For variables
const timedisplay = document.querySelector('.time')
const blockNodelist = document.querySelectorAll('.blocks');
// For displaying time
const d = new Date();
timedisplay.textContent = d.getDate() + "/"
+ (d.getMonth()+1)  + "/" 
+ d.getFullYear() + " @ "  
+ d.getHours() + ":"  
+ d.getMinutes() + ":" 
+ d.getSeconds() + "." + d.getMilliseconds();

for (let index = 0; index < blockNodelist.length; index++){

    blockNodelist[index].addEventListener('click', function(){
        let blockstyle = getComputedStyle(blockNodelist[index]);
        let backgroundColor = blockstyle.backgroundColor

        if (backgroundColor === 'rgb(0, 0, 0)'){
            blockNodelist[index].style.backgroundColor = 'rgb(255, 255, 255)';

        }else if (backgroundColor === 'rgb(255, 255, 255)'){
            blockNodelist[index].style.backgroundColor = 'rgb(0, 0, 0)';
        }
})}
    
    