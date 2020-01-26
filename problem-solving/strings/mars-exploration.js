/*
    Created on Sun Jan 26 2020 22:59:38
    Copyright (c) 2020 - Mohammed Elzanaty - sceel.io 
*/

'use strict';

function marsExploration(s) {
  let msg = 'sos';
  let numberOfMessages = s.length / 3;
  let receivedSignal = s.toLowerCase();
  let expectedSignal = msg.repeat(numberOfMessages);
  let score = 0;

  for (let index = 0; index < s.length; index++) {
    if (receivedSignal.charAt(index) !== expectedSignal.charAt(index)) {
      score++;
    }
  }
  return score;
}

let s = 'SOSSOT';
let answer = marsExploration(s);
console.log(answer);
