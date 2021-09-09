const result = 'Hello world!'.indexOf('world')
console.log(result);

const str = 'happy@gmail.com';
console.log(str.match(/.+(?=@)/)[0])

const msg = '   hello       world';
console.log(msg.length);

console.log(msg.length);
const count =msg.trim();
console.log(count.length);

const pi = 3.141592747;
console.log(pi);

const s1 = pi.toFixed(2); // toFixed 몇 자리수 까지
console.log(s1);
console.log(typeof s1); // string

const integer = parseInt(s1);
const float = parseFloat(s1);

console.log(integer);
console.log(float);
console.log(typeof integer, typeof float); // number

// 배열
const cars = ["Volvo", "KIA", "BMW", "Aston"];

const numbers = [1,2,3];

console.log(cars);
console.log(numbers);
console.log(cars[1]);
console.log(numbers[2]);

console.log([].length);
console.log(numbers.concat(cars));

const ages = [3, 10, 18 ,20];

function checkAge(age) {
    return age > 18;
};

function myFunction() {
    document.getElementById("demo").innerHTML = ages.find(checkAge);
}

// myFunction();

// cars.forEach(function(element, index, array) {
//     console.log(element, index, array)
// }) 
// cars.forEach(function(element, index ) {
//     console.log(index, element)
// }) 
const arrSu = cars.forEach(function(car, index ) {
    // console.log(`${car} - ${index}`);
    return `${car} - ${index}`;
}) 
console.log(arrSu);

// map()
const arrSu2 = cars.map(function(car, index ) {
    // console.log(`${car} - ${index}`);
    return `${car} - ${index}`;
}) 
console.log(arrSu2);