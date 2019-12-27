'use strict';

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

function diagonalDifference(arr) {
  let primaryDiagonal = 0;
  let secondaryDiagonal = 0;
  // Looping through the array and summing the diagonals.
  for (let i = 0; i < arr.length; i++) {
    // Calculating the primary diagonal
    primaryDiagonal += arr[i][i];
    // Reversing the second dimension of array to calculate secondary diagonal.
    secondaryDiagonal += arr[arr.length - 1 - i][i];
  }
  return Math.abs(primaryDiagonal - secondaryDiagonal);
}

const result = diagonalDifference([
  [11, 2, 4],
  [4, 5, 6],
  [10, 8, -12]
]);

console.log(result);
