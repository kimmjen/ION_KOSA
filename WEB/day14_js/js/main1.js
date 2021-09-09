// 즉시실행함수

const d = 7
function doubleFunc() {
    console.log(d * 2)
}

(function () {
    console.log(d * 2);
})();

// 화살표 함수
// () => {}  vs function { }
const doubleFn = function(x, y) {
    return x * 2
}

console.log('doubleFn: ', doubleFn(7));
console.log('doubleFn: ', doubleFn(3, 5, 8));

// const doubleArrow = (x, y) => {
// const doubleArrow = x => {
//     return x * 2
// }

// const doubleArrow = x => x * 2
// const doubleArrow = x => [1, 2, 3]
const doubleArrow = x => ({ name: 'test'}) // ()로 묶어줘야함.


console.log('doubleArrow: ', doubleArrow(7))
// 함수

 // arguments 사용
function sum2() {
    console.log(arguments)
    return arguments[0] // 7
}

console.log(sum2(7, 3, 8, 6))

function hap2(x, y) {
    if(x < 2) {
        return x + 2;
    }
    return x + y;
}
console.log(hap2(1,10)) // 3
console.log(hap2(3,10)) // 13


const sum = function(x, y){
    return x + y;
}

const plus = sum(30, 50) // 80
console.log(plus)

/* =============================== */

function hap(x, y){
    return x + y
}
hap(1, 2) 
hap(10, 32) 
console.log(hap(1, 5) + hap(10, 20)) // 36

const b = hap(11, 22)
console.log(b) // 33

// let, const <--- 블럭레벨
// var <--- 함수레벨


function scope() {
    if(true) {
        var a = 123;         
        console.log(a)
    }
}


scope() // 123