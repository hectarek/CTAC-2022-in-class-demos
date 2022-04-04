const list = document.getElementById('list');
const button = document.getElementById('submit');
const inputBox = document.getElementById('newTodo');
const inputContainer = document.getElementById('input-container');

let addItem = () => {
    let listItem = document.createElement('li');
    listItem.innerHTML = inputBox.value;
    list.insertBefore(listItem, inputContainer);
    inputBox.value = '';
}

button.addEventListener('click', addItem);

list.addEventListener('click', (e) => {
    if (e.target.tagName == "LI" && e.target.id != 'input-container'){
        e.target.style.textDecoration = 'line-through';
        e.target.style.animation = 'disappear 1.1s';
        setTimeout(() => e.target.remove(), 1000);  
    }
})