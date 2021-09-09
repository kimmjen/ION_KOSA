// const 인스턴스1 = {
//     프로퍼티1 = 초기값1,
//     프로퍼티2 = 초기값2,
//     메소드1 : function() {

//     },
//     메소드2 : function() {

//     }
// }

const test1 = {
    firstName: 'f',
    lastName: 'l',
    getFullName: function() {
        return `${this.firstName} ${this.lastName}`
    }
}
console.log(test1);
console.log(test1.getFullName());

const test2 = {
    firstName: 'f',
    lastName: 'l',
    getFullName: function() {
        return `${this.firstName} ${this.lastName}`
    }
}
console.log(test2);
console.log(test2.getFullName());
// =====================================================================
// function 클래스이름1() {
//     this.프로퍼티3 = 초기값3;
//     this.프로퍼티4 = 초기값4;
    
//     this.메소드3 = function() {
        
//     },
//     this.메소드4 = function() {
        
//     }
// }
// const XXXX = new 클래스이름1
function test3(first, last) {
    this.firstName = first;
    this.lastName = last;
    this.getFullName =  function() {
        return `${this.firstName} ${this.lastName}`
    }
}

const name = new test3('f', 'l');
console.log(name);
console.log(name.getFullName());
