/*
    Created on Sun Jan 26 2020 21:45:17
    Copyright (c) 2020 - Mohammed Elzanaty - sceel.io 
*/

'use strict';

function minimumNumber(n, password) {
  const MIN_CHAR_PASSWORD = 6;
  let mustHaveChars = 0;
  let patterns = [/[A-Z]/g, /[a-z]/g, /[0-9]/g, /[!@#$%^&*()\-+]/g];
  for (const pattern of patterns) {
    if (!new RegExp(pattern).test(password)) mustHaveChars++;
  }
  let len = n + mustHaveChars;
  return len < MIN_CHAR_PASSWORD ? mustHaveChars + (MIN_CHAR_PASSWORD - len) : mustHaveChars;
}

let n = 7;
let password = 'AUzs-nV';
let answer = minimumNumber(n, password);
console.log(answer);
