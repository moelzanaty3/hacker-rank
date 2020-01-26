/*
    Created on Sun Jan 26 2020 21:45:17
    Copyright (c) 2020 - Mohammed Elzanaty - sceel.io 
*/

'use strict';

function camelcase(s) {
  let counter = 1;
  if (s === s.toLowerCase()) return 1;
  for (const letter of s) {
    if (letter === letter.toUpperCase()) counter++;
  }
  return counter;
}

s = 'saveChangesInTheEditor';
let result = camelcase(s);
console.log(result);
