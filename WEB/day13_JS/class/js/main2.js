import random from "./test2.js";

// 비교연산자(comparison operator)
const a = 1 === 1;
const b = 3;

console.log(a === b);
console.log(a !== b);

function isEqual(x, y) {
    return x === y;
}

console.log(isEqual(1, 1));
console.log(isEqual(2, '2'));

console.log(a > b);

const d = 1 < 2
if (d) {
    console.log('참');
} else {
    console.log('거짓');
}

console.log(a ? '참' : '거짓');

let rand = Math.floor(Math.random() * 10);
console.log('rand : ' + rand);
console.log(Math.floor(Math.random() * 10));

console.log('------------------');

const e = random();

if (e === 0) {
    console.log('e is 0');
} else {
    console.log(e + ' rest....');
}
console.log('switch~case');

switch (e) {
    case 0:
        console.log('e is 0');
        break;
    default:
        console.log(e + ' rest....');
        break;
}

for (let i = 0; i < 3; i++) {
    console.log(i);
}

const ulEl = document.querySelector('ul');

for (let i = 0; i < 3; i++) {
    const li = document.createElement('li');
    li.textContent = `list-${i + 1}`;
    ulEl.appendChild(li);
    li.addEventListener('click', function () {
        if ((i + 1) % 2 == 0) {
            console.log(li.textContent);
        }
    });
}