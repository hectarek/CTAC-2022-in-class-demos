let myArray = ['pasta', 'pizza', 'pierogis'];

const myPromise = new Promise((resolve, reject) => {
    setTimeout(() => {
        resolve(myArray);
        reject('Error: error, something went wrong');
    }, 2000);
})

myPromise
.then((data) => {
    console.log(data);
    data.push('pork chops');
    return data;
})
.then((modifiedData) => {
    console.log(modifiedData);
})
.catch((error) => {
    console.log(error);
})

// console.log(myPromise);