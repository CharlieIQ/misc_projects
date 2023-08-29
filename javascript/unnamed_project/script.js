"use strict"

// For variables
const timedisplay = document.querySelector('.time')
const blockNodelist = document.querySelectorAll('.blocks');
// For displaying time
const d = new Date(); // Initializes date
// Displays time using basic ctring concatenation
timedisplay.textContent = d.getDate() + "/"
+ (d.getMonth()+1)  + "/" 
+ d.getFullYear() + " @ "  
+ d.getHours() + ":"  
+ d.getMinutes() + ":" 
+ d.getSeconds() + "." + d.getMilliseconds();

for (let index = 0; index < blockNodelist.length; index++){
    // For all of the color tiles
    blockNodelist[index].addEventListener('click', function(){
        let blockstyle = getComputedStyle(blockNodelist[index]);
        let backgroundColor = blockstyle.backgroundColor
        // All of the color changes for the tiles
        // Order: black -> white -> red -> green -> blue -> yellow -> cyan -> black
        if (backgroundColor === 'rgb(0, 0, 0)'){ 
            blockNodelist[index].style.backgroundColor = 'rgb(255, 255, 255)'; 

        }else if (backgroundColor === 'rgb(255, 255, 255)'){
            blockNodelist[index].style.backgroundColor = 'rgb(255, 0, 0)';

        }else if (backgroundColor === 'rgb(255, 0, 0)'){
            blockNodelist[index].style.backgroundColor = 'rgb(0, 255, 0)';

        }else if (backgroundColor === 'rgb(0, 255, 0)'){
            blockNodelist[index].style.backgroundColor = 'rgb(0, 0, 255)';

        }else if (backgroundColor === 'rgb(0, 0, 255)'){
            blockNodelist[index].style.backgroundColor = 'rgb(255, 255, 0)';

        }else if (backgroundColor === 'rgb(255, 255, 0)'){
            blockNodelist[index].style.backgroundColor = 'rgb(0, 255, 255)';

        }else if (backgroundColor === 'rgb(0, 255, 255)'){
            blockNodelist[index].style.backgroundColor = 'rgb(0, 0, 0)';

        }
})}
    
/* TEST FOR A GRAPH
const xValues = [];
const yValues = [];
generateData("x ** 2 + 7", 0, 10, 0.5);

new Chart("myChart", {
  type: "line",
  data: {
    labels: xValues,
    datasets: [{
      fill: false,
      pointRadius: 1,
      borderColor: "rgba(255,0,0,0.5)",
      data: yValues
    }]
  },
  options: {...}
});

function generateData(value, i1, i2, step = 1) {
  for (let x = i1; x <= i2; x += step) {
    yValues.push(eval(value));
    xValues.push(x);
  }
}
*/
