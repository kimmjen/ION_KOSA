// 타이머 함수
// setTimeout(함수, 시간) : 일정 시간 후 함수 실행
// setInterval(함수, 실행) : 시간 간격마다 함수 실행
// clearTimeout() : 설정된 Timeout 함수를 종료
// clearInterval() : 설정된 Interval 함수를 종료

// 1/1000 <=== 1초

const timer = setTimeout(() => {
    console.log('jaehyeok')
}, 3000);

const h1E1 = document.querySelector('h1')
h1E1.addEventListener('click', () => {
    clearTimeout(timer)
})

/*-------------------------*/
// 콜백 함수(callback) : 함수의 인수로 사용되는 함수

function timeout(call) {
    setTimeout(() => {
        console.log('test')
        call()
    }, 1000); 
}

timeout(() => {
    console.log('Done')    
})






