import getType from './test.js';

console.log(typeof 'Hello World!!');
console.log(typeof 123);
console.log(typeof true);
console.log(typeof undefined);
console.log(typeof null); // object
console.log(typeof {}); // object
console.log(typeof []); // object

console.log(getType(123));
console.log(getType(false));