const king = document.getElementById('b325');
console.log(king);

const businessLamp = document.getElementsByClassName('asteroid big');
for (let i=0; i<businessLamp.length; i++) {
    console.log(businessLamp[i]);
}

const conceitedKing = document.querySelectorAll('section div');
conceitedKing.forEach(function(item) {
    alert(item.textContent);
});

const noBusiness = document.querySelectorAll('body div');
noBusiness.forEach(function(item) {
    console.log(item);
})


