// Day 23, Dom practice examples



//Get all inputs
// const inputs = document.getElementsByTagName('input');
// const inError = document.getElementsByClassName('error');

// inputs.length; //2
// inError.length; //1

// const paragraphs = document.querySelectorAll('p');
// const heading = document.querySelectorAll('h1');

// //Works!
// const pCount = paragraphs.length;
// const firstP = paragraphs[0];

// console.log("paragraphs", paragraphs);
// console.log("pCount", pCount);
// console.log("firstP", firstP);
// console.log("heading", heading);

// const paraArray = Array.from(paragraphs);
// paraArray.push(heading);
// console.log("paragraphs", paraArray);


//Doesn't work!
// links.forEach(function(link){
//         //do something with link
// });

// Array methods like forEach, map, reduce, and so on, don't work. Luckily, its easy enough to convert a nodeList into an Array;

// const links = document.querySelectorAll('a');
// const arrayOfLinks = Array.from(links);


// Children

// const listItems = document.querySelector('ul').children;

// console.log(listItems);

// Editing the DOM 


// const list = document.querySelector('ul');
// const otherList = document.getElementsByTagName('ul')[0];

// for (let i = 3; i < 7; i++) {
//     let listItem = document.createElement('li');
//     listItem.innerHTML = 'item ' + i;
//     list.appendChild(listItem);
// }

// list.className = 'myClass';

// otherList.children[1].children[0].href = 'www.google.com';
// console.log(otherList);

// Add event Listeners

const myButton = document.querySelector('button');

const myTextBox = document.getElementById('myInput');

myTextBox.addEventListener('keyup', function(e) {
    if (e.key == "Enter"){
        alert('You have submitted the text');
    }
});

document.querySelector('.outer').addEventListener('click', function(e){
    // e represents the event (element that has been clicked)
        console.log(e.target, e.currentTarget);
        //inner, outer
})


// document.querySelector("#newtodo").addEventListener("keyup", function(e) {
//     if (e.keyCode == 13) {
//         console.log('Has pressed Enter');
//     }
// });