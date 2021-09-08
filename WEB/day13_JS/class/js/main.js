// HTML 요소(Element) 1개 검색/찾기
const boxE1 = document.querySelector('.box');

// HTML 요소 모두 검색/찾기
let boxEls = document.querySelectorAll('.box');
console.log('boxEls: ' + boxEls);

// 찾은 요소를 반복해서 함수 실행
// 익명 함수를 인수로 추가
boxEls.forEach(function (boxE, index) {});

// 첫 번째 매개변수(boxE1)
boxEls.forEach(function (boxE, index) {});

// 출력
boxEls.forEach(function (boxE, index) {
    boxE.classList.add(`order-${index + 1}`);
    console.log(index, boxE);
});

// HTML 요소에 적용할 수 있는 메소드
// boxE1.addEventListener();

// 인수(Arguments)를 추가 가능
// boxE1.addEventListener(1, 2);

// 1 - 이벤트(Event, 상황)
// boxE1.addEventListener('click', 2);

// 2 - 핸들러(Handler, 실행할 함수)
boxE1.addEventListener('click', function () {
    alert('눌렸네요');
    console.log('Click~~~');
});

// 요소의 클래스 정보 객체 활용
boxE1.classList.add('active');
console.log(boxE1.classList.contains('active'));

boxE1.classList.remove('active');
let isContains = boxE1.classList.contains('active');
console.log(isContains);

// 요소가 갖고있는 텍스트(값)을 가져오거나(get), 세팅(set)
const boxEl2 = document.querySelector('.box');

// Getter, 값을 얻는 용도
console.log(boxEl2.textContent);

// Setter, 값을 지정하는 용도
boxEl2.textContent = 'Happy';
console.log(boxEl2.textContent);

const str = 'I-ON';
// split : 문자열을 인수 기준으로 쪼개서 배열로 반환
// reverse : 배열을 뒤집기
// join : 배열을 인수 기준으로 문자로 병합해서 연결

const str2 = str.split('').reverse().join(''); // 메서드 체이닝
console.log(str2);