# day11 - 2021. 09. 06

## html 형태

> html5

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body></body>
</html>
```

- emmet 코드
  [참고고사이트](<https://ko.wikipedia.org/wiki/%EC%97%90%EB%B0%8B_(%EC%86%8C%ED%94%84%ED%8A%B8%EC%9B%A8%EC%96%B4)>)

```
div#page : <div id="page></div>
div.logo : <div class="page"></>div>
ul#navigation : <ul id="navigatino"></ul>
li*5 : <li></li>를 5개  생성
a : <a href=""></a>
```

- Server Side Script:
- Client Side Script
  : <----- 서버 구축 안되어 있어도 실행됨. 브라우저가 해석하기 때문에 웹브라우저만 있으면 실행됨
  --> 편집기 : 메모장, 에디터플러스, 울트라에디트,...한글,....이클립스 등등에서 편집가능함

태그 속성 = "값"

> css 적용한 경우

```
1) inline
  <img src="../images/1.jpg" style="border: 3px solid; ">
 <img src="Flower2.jpg" style="속성: 값; 속성: 값;..... ">
2) internal
3) external  <---- file.css
```

> css 외부 파일 링크

```
  <link rel="stylesheet"  href="../css/myStyle.css"  type="text/css">

   선택자 { 속성: 값; 속성: 값; ..... }
   선택자, 선택자2, 선택자3... { 속성: 값; 속성: 값; ..... }
   선택자 서브엘리먼트 { 속성: 값; 속성: 값; ..... }
   p  em { 속성: 값; 속성: 값; ..... }
   div  span { 속성: 값; 속성: 값; ..... }

   .className { 속성: 값; 속성: 값; ..... }
   ex) .red { color : red; }
   선택자.className { 속성: 값; 속성: 값; ..... }
   ex) p.blue { 속성: 값; 속성: 값; ..... }


   #idName { 속성: 값; 속성: 값; ..... }
   ex) #header { 속성: 값; 속성: 값; ..... }
        div#id { 속성: 값; 속성: 값; ..... }

  <a href="site"> site </a>
  <a href="mailto:happydoyeon88@gmail.com"> site </a>

위치이동

<a name = "top"></a>
<a href= " #top"></a>
```

>

[태그 type 종류](https://webisfree.com/2014-07-31/[css]-ul-li%ED%83%9C%EA%B7%B8%EC%97%90%EC%84%9C-%EC%9E%90%EC%A3%BC-%EC%93%B0%EC%9D%B4%EB%8A%94-%EB%A6%AC%EC%8A%A4%ED%8A%B8-%EC%8A%A4%ED%83%80%EC%9D%BC-%EC%A2%85%EB%A5%98)
```
ol type="1, A, a, I, i" 5가지의 표현 방법 존재

ul 태그 type 종류
- disc

- hiragana

- hiragana

- lower-alpha

- lower-alpha

- square


- circle

- decimal

- decimal

- upper-alpha

- upper-alpha

- upper-roman

- upper-roman

- none

```