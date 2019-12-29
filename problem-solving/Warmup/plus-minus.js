// MUST PRINT
/**
 * A decimal representing of the fraction of positive numbers in the array compared to its size.
 * A decimal representing of the fraction of negative numbers in the array compared to its size.
 * A decimal representing of the fraction of zeros in the array compared to its size.
 */
function plusMinus(arr) {
  let length = arr.length;
  let positive = 0;
  let zeros = 0;
  let negative = 0;

  arr.forEach(element => {
    if (Math.sign(element) === 1) positive++;
    if (Math.sign(element) === -1) negative++;
    if (Math.sign(element) === 0) zeros++;
  });
  console.log((positive / length).toPrecision(6));
  console.log((negative / length).toPrecision(6));
  console.log((zeros / length).toPrecision(6));
}

plusMinus([-4, 3, -9, 0, 4, 1]);
