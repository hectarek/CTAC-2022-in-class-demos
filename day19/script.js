// Day 19 Higher Order Functions

// function add(number1, number2) {
//     return number1 + number2;
// }

// function subtract(number1, number2) {
//      return number1 - number2;
// }

// function calculator(myFunction, number1, number2) {
//     return myFunction(number1,number2);
// }

// console.log(calculator(add, 1, 2));
// console.log(calculator(subtract, 5, 2));
// console.log('skldfj');


// Higher Order Array Functions

// FILTER
// function evens(num){
//     return num % 2 == 0;
//   }

// const numbers = [1,2,3,4,5,6,7,8,9,10,11,12];

// let evenNumbers = numbers.filter((num) => {
//     return num % 2 == 0;
//   }
// )

// console.log(evenNumbers);

// let oddNumbers = numbers.filter(function(num) {
//       return num % 2 != 0
//    }
// )

// console.log(evenNumbers); // [2,4,6,8,10,12]
// console.log(oddNumbers); // [1,3,5,7,9,11]

// FIND

// const users = [
// 	{ name: "Alberta Johnson", isActive: true, age: 33 },
// 	{ name: "Darnell Thompson", isActive: false, age: 25 },
// 	{ name: "Sally Seashell", isActive: false, age: 41 },
// 	{ name: "Inija Rosas", isActive: true, age: 56 },
// ];

// const userOlderThan40 = users.find(function(user) {
//         return user.age > 40;
//     } 
// );

// console.log(userOlderThan40); // {name: 'Sally Seashell', isActive: false, age: 41}

// const currentOnlineUsers = users.filter((user) => user.isActive);
// const userOlderThan40 = users.find((user) => user.age > 40);

// console.log(currentOnlineUsers); // {name: 'Alberta Johnson', isActive: true, age: 33},
// // {name: 'Inija Rosas', isActive: true, age: 56}

// console.log(userOlderThan40); // {name: 'Sally Seashell', isActive: false, age: 41}

// MAP

// const users = [
// 	{ name: "Alberta Johnson", isActive: true, age: 33 },
// 	{ name: "Darnell Thompson", isActive: false, age: 25 },
// 	{ name: "Sally Seashell", isActive: false, age: 41 },
// 	{ name: "Inija Rosas", isActive: true, age: 56 },
// ];

// const returnNameAndAge = users.map((user) => user.name + " is " + user.age + " years old.");

// console.log(returnNameAndAge);
// console.log(users);

// REDUCE 

// const grades = [100,94,88,53,79,93,80,100,77,64,85,87,92];

// const reduceGrades = grades.reduce(function(grade, total) {
//     return total + grade;
// }, 0);

// console.log(reduceGrades);

// const avgGrades = (reduceGrades / grades.length);

// console.log(avgGrades);

// FOR EACH

// const trees = ['birch', 'cyprus', 'cedar', 'ashwood', 'oak'];

// const listOfTrees = trees.forEach(function(tree) {
//     console.log(tree);
// });

// THIS

// const admin = {
//     name: 'Erin',
//     consoleName: function() {
//         console.log(this.name);
//     }
// }



// thisIsMyAdminObjectThatHasALongName.consoleName(); //'Erin'


// ASYNC JS

// Say "Hello."
console.log("Hello.");

// Say "Goodbye" two seconds from now.
setTimeout(function() {
  console.log("Goodbye!");
}, 2000);

// Say "Hello again!"
console.log("Hello again!");