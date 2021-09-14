# day 16 - 21/09/13

> HTML & CSS & JS 복합 예제

  > jQuery & AJAX
  http://jquery.com/

 1) file download
 2) CDN 방식

 > chrome 부가기능 추가
   https://chrome.google.com/webstore

 > JSON 동강
 https://opentutorials.org/course/49/3473

 json array 형식 
 [
	{
		"name": "식빵",
		"family": "웰시코기",
		"age": 1,
		"weight": 2.14
	},
	{
		"name": "콩콩",
		"family": "포메라니안",
		"age": 3,
		"weight": 2.5
	},
	{
		"name": "젤리",
		"family": "푸들",
		"age": 7,
		"weight": 3.1
	}

 ] 
 
> Ajax
## Ajax로 서버와 통신하며 데이터를 주고 받을 때 데이터 교환을 쉽게 하기 위해 JSON을 사용한다.
 
 - ajax status 참고 사이트
  https://leelsm.tistory.com/11

  $.ajax({

            url: 요청이 보내지는 곳,

            type: http요청 방식 get/post,

            dataType: data의 타입,

            data: 서버로 넘어갈 값, 

            success: http 요청 성공의 경우 동작할 함수,

            error: http 요청 실패의 경우 동작할 함수,

            complete: http 요청 완료 후 동작할 함수,

            global: 전역 함수 여부 true/false,

            async: 동기 여부 true/false

        });