let lineCount = 10;
let line = '';
let countOnLine = ((lineCount-1)*2)+1;
let center = Math.round(countOnLine/2);
console.log(center);
console.log(countOnLine);
for (let i = 1; i < lineCount+1; i++) {
    for (let j = 1; j < countOnLine+1; j++) {
        if (j>center-i && j<center+i) {
            line += '*';    
        } else {
            line += ' ';
        }
    }
    console.log(line);
    line = '';
}

