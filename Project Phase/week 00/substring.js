function subStr(stringToSearchIn, keyWord) {
  if (keyWord.length <= stringToSearchIn.length) {
    for (let i = keyWord.length; i < stringToSearchIn.length + 1; i++) {
      var sub = stringToSearchIn.substring(i - keyWord.length, i);
      if (sub.localeCompare(keyWord) === 0) {
        return i - keyWord.length;
      }
    }
  }
  return -1;
}

console.log(
  subStr("Create a function that takes two strings as a parameter.", "o s")
);
