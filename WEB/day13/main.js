//
document.write("<table>");
document.write("<thead>");
document.write("<tr>");
for (let i = 2; i <= 9; i++) {
  document.write("<th>" + i + "단" + "</th>");
}
document.write("</tr>");
document.write("</thead>");
document.write("<tbody>");

for (let i = 1; i <= 9; i++) {
  document.write("<tr>");
  for (let j = 2; j <= 9; j++) {
    document.write("<td>" + j + "*" + i + "=" + i * j + " </td>");
  }
  document.write("</tr>");
}
document.write("</tbody>");
document.write("</table>");

//
let num = prompt("숫자 입력하세요");

if (num % 2 === 0) {
  let result = parseInt(num) + 77;
  document.write(`입력하신 값 짝수 -> ${num} + 77 = ${result} 입니다.<br>`);
} else {
  let result = parseInt(num) + 55;
  document.write(`입력하신 값 홀수 -> ${num} + 55 = ${result} 입니다.<br>`);
}

//
let ulEl = document.querySelector(".blank");

for (let i = 0; i < 10; i++) {
  let li = document.createElement("li");
  li.textContent = `li-${i + 1}`;
  ulEl.appendChild(li);
}

//
function line() {
  document.write("---------------------------------------<br>");
}
line();
line();

function doubleFunc(x) {
  return x * 2;
}

document.write(doubleFunc(33));
document.write("<br>");
document.write(doubleFunc(8));
