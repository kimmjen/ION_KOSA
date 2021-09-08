// 비교 연산자 (comparison operator)

const a = 1 ===1
const b = 'AB' === 'AB'
const c = true

console.log(a === b);
console.log(a !== b);

console.log(a);
console.log(b);
console.log(c);
console.log('&& : ', a && b && c);
console.log('|| : ', a || b || c);

function isEqual(x, y) {
    return x === y;
}

console.log(isEqual(1,1));
console.log(isEqual(2, '2'));

console.log(a > b)

const d = 1 < 2
if (d) {
    console.log('참')
} else {
    console.log('거짓')
}
 
console.log(a ? '참' : '거짓')

let rand = Math.floor(Math.random() * 10);
console.log('rand : ', rand)
console.log(Math.floor(Math.random() * 10));

// function solution(num) {
//     if (num % 2 === 0) {
//         return ("짝수 이면 77 더하기 = " +`${num+77}`);
//     } else {
//         return ("홀수 이면 55 더하기 = " +`${num+55}`);
//     }

// }