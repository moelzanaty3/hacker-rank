/**
 * Complete the miniMaxSum function in the editor below.
 * It should print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.
 * miniMaxSum has the following parameter(s):
 * arr: an array of  integer
 */

function miniMaxSum(arr) {
  // sort first
  arr = arr.sort();

  // to get the sets only
  let maxSet = arr.slice(1);
  let minSet = arr.slice(0, -1);

  minimumSum = minSet.reduce((acc, current) => (acc += current), 0);
  maximumSum = maxSet.reduce((acc, current) => (acc += current), 0);

  console.log(minimumSum, maximumSum);
}

miniMaxSum([1, 2, 3, 4, 5]);
