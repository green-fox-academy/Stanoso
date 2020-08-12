const fill = document.querySelectorAll('p');
console.log(fill);

fill.forEach(function(item) {
    item.innerHTML += (' ' + item.innerHTML);
})


fill.forEach(function(item) {
    item.innerHTML += (' ' + item.innerText);
})
