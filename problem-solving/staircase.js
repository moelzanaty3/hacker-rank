/**
 * Complete the staircase function in the editor below. It should print a staircase as described above.
 * staircase has the following parameter(s):
 * n: an integer
 * @param {*} numberOfStairs 
 */

function staircase(numberOfStairs) {

    let stair = '#';
    let space = ' ';
    for (let index = 1; index < numberOfStairs; index++) {
        console.log((space.repeat(numberOfStairs-index)).concat(stair.repeat(index)))
    }
}

staircase(6);