// Lesson Notes for Day 18

// Arrow Functions

// let addNum = () => {x+y}

// let multiplyNum = (x,y) => {
//     return x*y;
// }

// let x = 3;
// let z = 6;

// function multiply() {
//     return x*z;
// }

// multiply(3,5,235);



// // hoisting
// function codeHoist(){
//     a = 10;
//     let b = 50;
// }
// codeHoist();

// console.log(a); // 10
// console.log(b); // ReferenceError : b is not defined

// console.log(add(5,3)); // 8

// function add(num1, num2) {
//     return num1+num2;
// }

// makeNoise(); // TypeError: makeNoise is not a function!

// const makeNoise = function() {
//     console. log('Kabow!');
// }

// Anonymous functions

// const calculator = {
// 	add: function (a, b) {return a + b;},
// 	subtract: function (a, b) {return a - b;},
// };

// calculator.add(3, 6); // 9
// calculator.subtract(6, 5); // 1


// Scope

// if (true) {
// 	let x = "Hello World";
// }

// if (true) {
// 	let x = "Hello World";
// }

// console.log(message); // Reference Error: message is not defined



// function getCowboyGreeting(name) {
//     const greeting = "Hey there partner! So they call you ";
//     return greeting + name + "?";
// }
// getCowboyGreeting('Clint Eastwood'); // 'Hey there partner! So they call you Clint Eastwood?'
// console.log(greeting) //undefined


// SCOPE CHAIN
// const myCalculator = (num1, num2) => {

//     const add = function(x, y) {
//         return x + y;
//     }

//     const subtract = function(x, y) {
//         return x - y;
//     }

//     if (num1 <= num2) {
//         return add(num1,num2);
//     } else {
//         return subtract(num1,num2); // 1;
//     }
// }

// console.log(myCalculator(2,5)); // 7
// console.log(myCalculator(6,5)); // 1


let obj = {
    myVariable: function() {
        let 
    },
    key: 'thi'
}

// RECURSION


// function recurse(num) {
//     if(num < 20) {
//         console.log(num)
//         num++;
//         recurse(num);
//     }
//     else {
//         console.log('Stop recursing');
//     }
// }

// console.log(recurse(4));

const renderLandscape = () => {
    let result = "";
    
    const ground = (size) => {
        for (let count = 0; count < size; count++) {
            result += " _ ";
        }
    };
    
    const mountainRange = (size) => {
        result += "/";
        for (let count = 0; count < size; count++) {
           result += "W";
        } 
        result += "\\";
    };
    
    ground(3);
    mountainRange(5);
    ground(5);
    mountainRange(2);
    ground(4);
    mountainRange(4);
    ground(1);
    return result;
};

console.log(renderLandscape());


let user = {
    name: 'John Doe',
    email: ['john@mail.com', 'john2@mail.com'],
    age: 31,
    isActive: true,
    dependent: {
        name: 'Sally Sue',
        age: 32,
        email: ['sally@mail.com', 'sally3@mail.com']
    }
}

let user2 = {
    name: 'My Name',
    age: 34,
}

console.log(user2);


let appData = {
    name: 'Gmail',
    mailboxes: {
            inbox: [
                { subject: 'some random email', message: 'This is the text' },
                { subject: 'some random2 email', message: 'This is the text' },
                { subject: 'some random3 email', message: 'This is the text' },
            ]
    },
    contacts: [
            {name: 'Erin', lastMessage: "I wont be in class today"},
            {name: 'Matt', lastMessage: "Today, we are going to rock it!"}
    ]
    
    // Etc...
}