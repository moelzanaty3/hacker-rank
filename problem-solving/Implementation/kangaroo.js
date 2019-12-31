/**
 *  It should return YES if they reach the same position at the same time, or NO if they don't.
 *
 * @param {*} x1  integer, starting position distance for kangaroo 1
 * @param {*} v1  integer, jump distance for kangaroo 1
 * @param {*} x2  integer, starting position distance for kangaroo 2
 * @param {*} v2  integer, jump distance for kangaroo 2
 */
function kangaroo(x1, v1, x2, v2) {
  if (v1 < v2) return 'NO';
  if (x1 < x2 && v1 > v2) {
    const xDiff = Math.abs(x1 - x2);
    const vDiff = Math.abs(v1 - v2);
    return xDiff % vDiff === 0 ? 'YES' : 'NO';
  }
  return 'NO';
}
let caseOne = kangaroo(0, 2, 5, 3);
let caseTwo = kangaroo(0, 3, 4, 2);

console.log(caseOne);
console.log(caseTwo);
