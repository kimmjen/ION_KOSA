let num = eval(prompt('num : '));

if (num % 2 == 0) {
    num += 77;
} else {
    num += 55;
}

document.write(num);