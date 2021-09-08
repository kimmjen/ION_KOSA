const ul = document.getElementsByClassName('blank')[0];

for (let i = 0; i < 10; i++) {
    const li = document.createElement('li');
    li.textContent = `list-${i + 1}`;
    ul.append(li);
}