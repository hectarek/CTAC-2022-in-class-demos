// DEFAULT PARAMETER

// function add(x = 4, y = 5) {
//   return x + y;
// }

// console.log(add(6, 8));


// REST Parameter

// function say(x,y, ...theRest) {
//   return theRest;
// }

// // function say(x,y) {
// //     console.log(x, y);
// //     console.log(arguments);
// //     // theRest.forEach(p => console.log(p));
// // }

// console.log(say('a', 'b', 'c', 'd',4,'u',true));
// say('a', 'b', 'c', 'd',4);
// say('a', 'b', 'c', 'd',4,5,6,7,8,2,2,'aslfkjsaf',234,25,235,235235);

// SPREAD OPERATOR

// let arr1 = ['one', 'two'];

// let arr2 = [arr1, 'three', 'four', 'five'];

// let arr3 = [...arr1, 'three', 'four', 'five'];

// console.log(arr2);
// console.log(arr3);

// let hi = "Hello World"
// let hiArray = [ ...hi ]

// console.log(hiArray);

// const obj1 = {
//     name: "obj1name",
//     method: function(){
//       return () => {return this.name};
//     }
//   };
  
//   const arrowFunc1 = obj1.method();
  
//   console.log(arrowFunc1());
  
//   const obj2 = {
//     name: "obj2name",
//     method: obj1.method
//   };
  
//   const arrowFunc2 = obj2.method();
  
//   console.log(arrowFunc2());
  