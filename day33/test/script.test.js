

// describe("Filter function", () => {
//   test("it should filter by a search term (link)", () => {
//     // actual test
//   });
// });


// describe("JS do Math", () => {
//   test("two plus two is four", () => {
//     expect(2 + 2).toBe(4);
//   });
// });


// test('object assignment', () => {
//   const data = {one: 1};
//   data['two'] = 2;
//   expect(data).toEqual({one: 1, two: 2});
// });

// test('adding positive numbers is not zero', () => {
//   for (let a = 1; a < 10; a++) {
//     for (let b = 1; b < 10; b++) {
//       expect(a + b).not.toBe(0);
//     }
//   }
// });

// test('null', () => {
//   const n = null;
//   expect(n).toBeNull();
//   expect(n).toBeDefined();
//   expect(n).not.toBeUndefined();
//   expect(n).not.toBeTruthy();
//   expect(n).toBeFalsy();
// });

// test('zero', () => {
//   const z = 0;
//   expect(z).not.toBeNull();
//   expect(z).toBeDefined();
//   expect(z).not.toBeUndefined();
//   expect(z).not.toBeTruthy();
//   expect(z).toBeFalsy();
// });

// function compileAndroidCode() {
//   throw new Error('you are using the wrong JDK');
// }

// test('compiling android goes as expected', () => {
//   expect(() => compileAndroidCode()).toThrow();
//   expect(() => compileAndroidCode()).toThrow(Error);

//   // You can also use the exact error message or a regexp
//   expect(() => compileAndroidCode()).toThrow('you are using the wrong JDK');
//   expect(() => compileAndroidCode()).toThrow(/JDK/);
// });

let user = {
  name: 'Hector',
  age: 27,
  isPremium: false,
}

let account = {
  amount: 'none',
  age: 8,
  type: 'savings',
}

import {someFunction} from '../script';

// describe('Test user object for various values', () => {
//   test('tests to see if user name is Hector', () => {
//     expect(user.name).toBe('Hector');
//   });

//   test('tests to see if the user is older than 13', () => {
//     expect(user.age > 13).toBeTruthy();
//     expect(user.age).toBeGreaterThan(13);
//   });

//   test('tests to see if the user is not premium',() => {
//     expect(user.isPremium).toBeFalsy();
//   });
// })

describe('Test user object for various values', () => {
  test('tests to see if user name is Hector', () => {
    expect(someFunction(3,5)).toBe(8);
  });
})

// describe('Test account object for various values', () => {
//   test('tests to see if user name is Hector', () => {
//     expect(user.name).toBe('Hector');
//   });

//   test('tests to see if the user is older than 13', () => {
//     expect(user.age > 13).toBeTruthy();
//     // expect(user.age).toBeGreaterThan(13);
//   });

//   test('tests to see if the user is not premium',() => {
//     expect(user.isPremium).toBeFalsy();
//   });
// })