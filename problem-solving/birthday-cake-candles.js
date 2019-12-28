/**
 * Complete the function birthdayCakeCandles in the editor below.
 * It must return an integer representing the number of candles she can blow out.
 * birthdayCakeCandles has the following parameter(s):
 * ar: an array of integers representing candle heights
 * @param {*} ar
 */
function birthdayCakeCandles(candles) {
  let max = Math.max(...candles);
  return candles.filter(x => x === max).length;
}

let result = birthdayCakeCandles([3, 2, 1, 3]);
console.log(result);
