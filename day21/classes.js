// Class Lecture for Day 21 OOP

// ES5 and below method

// let carObj = {
// 	make: "honda",
// 	model: "civic",
// 	year: 2012,
// 	mph: function () {
// 		return speed / time;
// 	},
// };

//

function Car(make, model, year) {
	this.make = make;
    this.model = model;
    this.year = year;
};

// // let jeep = new Car('Jeep', 'Cherokee', 2019, 70, 2);
// console.log(new Car);
// console.log(jeep.mph());

// class Car {
// 	constructor(make, model, year) {
// 		this.make = make;
// 		this.model = model;
// 		this.year = year;
// 	}
// 	mph() {
// 		return speed / time;
// 	}
// }

// let jeep = new Car('Jeep', 'Cherokee', 2019);
// console.log(new Car);
// console.log(jeep);

// Car { make: undefined, model: undefined, year: undefined }
// Car { make: 'Jeep', model: 'Cherokee', year: 2019 }

// let userName = "Jerry";
// let userType = "Active User";
// let dateJoined = new Date("10/24/2014");

// function getUser(userName, userType) {
// 	return "User: " + userName + " Type: " + userType;
// }

// ENCAPSULATION

// User: Jerry Type: Active User

// OR, the OOP way

// let user = {
// 	userName: "Jerry",
// 	userType: "Active User",
// 	dateJoined: new Date("10/24/2014"),
// 	getUser: function () {
// 		return "User: " + this.userName + " Type: " + this.userType;
// 	},
// };

// ABSTRACTION

// class User {
// 	constructor(name, type, isPremium ,dateJoined) {
// 		this.name = name;
// 		this.type = type;
//         this.isPremium = isPremium;
// 		this.dateJoined = dateJoined;
// 	}
// 	getUser() {
// 		return "User: " + this.name + " Type: " + this.type;
// 	}
//     checkIsPremium() {
//         return this.isPremium;
//     }
// }

// let jerry = new User('Jerry', 'Active User', true, new Date("10/24/2014"));
// console.log(jerry);
// // User { name: 'Jerry', type: 'Active User', isPremium: true, dateJoined: 2014-10-24 }

// Constructor

// class User {
// 	constructor(name, type) {
// 		this.name = name;
// 		this.type = type;
//     }
// }

// let tom = new User('Tom', 'Cat')
// let jerry = new User('Jerry', 'Mouse');

// class Book {
//     constructor(title, author, year) {
//         this.title = title;
//         this.author = author;
//         this.year = year;
//     }
//     getBookSummary() {
//         return `${this.title} was written by ${this.author} in ${this.year}.`;
//     }
//     getBookAge() {
//         const age = new Date().getFullYear() - this.year;
//         return `${this.title} is ${age} years old.}`;
//     }
//     reviseYear(newYear) {
//         this.year = newYear;
//         this.revised = true;
//     }
//     static getTopBookStore() {
//         return "Barnes & Noble";
//     }
// }

// // SUPER

// class Cookbook extends Book {
//     constructor(title, author, year, type) {
//         super(title, author, year);
//         this.type = type;
//     }
//     getBookType() {
//         return this.type;
//     }
// }

// const myCookbook = new Cookbook("Molly Cooks", "Chef Molly", "2012", 'BBQ Book');

// console.log(myCookbook.getBookSummary());

// // Prototypical

// class Dog {
// 	constructor(type) {
// 		this.type = type;
// 	}
// }

// Dog.prototype.bark = function () {
// 	return "The " + this.type + " says, Woof!";
// };

// let corgi = new Dog("corgi");
// let poodle = new Dog("poodle");

// console.log(corgi, poodle); // Dog { type: 'corgi' } Dog { type: 'poodle' }
// console.log(corgi.bark()); // The corgi says, Woof!

// PROTOYPICAL CHAIN

// function Person() {
// 	this.isAlive = true;
// }
// function Relative() {
// 	this.lastName = "Johnson";
// }
// function Mother() {
// 	this.isInCharge = false;
// }

// const per = new Person();
// Relative.prototype = per;

// const rel = new Relative();
// Mother.prototype = rel;

// const mom = new Mother();

// console.log(mom.isInCharge, mom.lastName, mom.isAlive);
// console.log(mom.hasOwnProperty('isInCharge'), mom.hasOwnProperty('lastName'));

// ES6

// class Person {
//     constructor(){
//         this.isAlive = true;
//     }
// }
// class Relative extends Person {
//     constructor() {
//         super();
//         this.lastName = 'Shanta';
//     }
// }
// class Mother extends Relative {
//     constructor() {
//         super();
//         this.isInCharge = true;
//     }
// }

// const per = new Person();
// Relative.prototype = per;

// const rel = new Relative();
// Mother.prototype = rel; 

// const mom = new Mother();

// console.log(mom.isInCharge, mom.lastName, mom.isAlive);
// console.log(mom.hasOwnProperty('isInCharge'), mom.hasOwnProperty('lastName'));



// let subtractFunction = (x, y) => {
//     return x - y;
//   }
  
//   console.log(subtractFunction);
