10. 연산자
== vs ===

11. scope
변수 유효범위(variable scope)
var, let, const

12. method(function)

12 -2. 즉시 실행 함수
(function () { // statements })

13 . class
1) 리터럴
2) 함수
3) 프로토타입


1. 리터럴
const 인스턴스1 = {
    프로퍼티1 = 초기값1,
    프로퍼티2 = 초기값2,
    메소드1 : function() {

    },
    메소드2 : function() {

    }
}

function 클래스이름1() {
    this.프로퍼티3 = 초기값3;
    this.프로퍼티4 = 초기값4;
    
    this.메소드3 = function() {
        
    },
    this.메소드4 = function() {
        
    }
}
2. 함수
const 인스턴스2 = new 클래스이름2();

3. 프로토 타입
function 클래스이름3() {
    this.프로퍼티5 = 초기값5;
    this.프로퍼티6 = 초기값6;

    클래스이름3.prototype.메소드5 = function() {

    },
    클래스이름4.prototype.메소드6 = function() {
        
    }
}

