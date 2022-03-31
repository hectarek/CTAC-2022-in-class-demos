// Day 24 API's

// function ajaxCall() {
//   const ajaxRequest = new XMLHttpRequest();

//   ajaxRequest.onreadystatechange = function() {
//       if (ajaxRequest.readyState == XMLHttpRequest.DONE ) {
//          if (ajaxRequest.status == 200) {
//              const myDiv = document.querySelector('.main');
//              const newDiv = document.createElement('div');
//              newDiv.innerHTML = ajaxRequest.responseText;
//              myDiv.appendChild(newDiv);
//          }
//          else if (ajaxRequest.status == 400) {
//             console.log('There was an error 400');
//          }
//          else {
//             console.log('something else other than 200 was returned');
//          }
//       }
//   };

//   ajaxRequest.open("GET", 'http://jsonplaceholder.typicode.com/todos', true);
//   ajaxRequest.send();
// }

// (function(document){
// const myBtn = document.getElementById('myButton');
// myBtn.addEventListener('click', ajaxCall);
// })(document);

let title = document.getElementById('title-text');
let body = document.getElementById('body-text');
let button = document.getElementById('myButton');

button.addEventListener('click', (e) => {
  fetch("https://jsonplaceholder.typicode.com/posts")
  .then((response) => response.json())
	.then((json) => {
    title.innerHTML = json[0].title;
    body.innerHTML = json[0].body;
  });
})


// fetch("https://jsonplaceholder.typicode.com/posts") // Same but transforms the JSON
// 	.then((response) => response.json())
// 	.then((json) => console.log(json[0].title));


// fetch('https://jsonplaceholder.typicode.com/posts', {
//   method: 'POST',
//   body: JSON.stringify({
//     title: 'foo',
//     body: 'bar',
//     userId: 1,
//   }),
//   headers: {
//     'Content-type': 'application/json; charset=UTF-8',
//   },
// })
// .then((response) => response.json())
// .then((json) => console.log(json));

// let myPosts = fetch('https://jsonplaceholder.typicode.com/posts/1')
// .then((response) => response.json())
// .then((json) => console.log(json));

// // Promises

// const p = new Promise(function(resolve,reject){
// 	//do something async...and get a value
// 	const myAsyncValue = 'abc'
// 	resolve(myAsyncValue);
// });

// p.then(function(data){
// 	//console.log(data);
// })

// //------------ dataService.js ------------
// function getUserByName(username) {
//     return new Promise(function(resolve,reject){
//          $.get('http://jsonplaceholder.typicode.com/users?username=' + username, function(users){
//              resolve(users[0]);
//          });
//      })
//     }

//     function getPostsByUser(user) {
//     return new Promise(function(resolve,reject){
//          $.get('http://jsonplaceholder.typicode.com/posts?userId=' + user.id, function(posts){
//              resolve(posts);
//          });
//     })
//     }

//     //------------ interface.js ------------

//     function render(posts) {
//     //render the posts data
//     console.log(posts);
//     }

//     function showUserItems(){
//     getUserByName('Bret')
//      .then(getPostsByUser)
//      .then(render);
//     }

//     showUserItems();
