/**
 *
 * It should print the number of apples and oranges that land on Sam's house, each on a separate line
 * @param {*} startingPointHouseLocation /s starting point of Sam's house location.
 * @param {*} endingPointHouseLocation /t ending location of Sam's house location.
 * @param {*} appleTreeLocation /a location of the Apple tree.
 * @param {*} orangeTreeLocation /b location of the Orange tree.
 * @param {*} applesDistancesFallsFromTree /apples distances at which each apple falls from the tree.
 * @param {*} orangesDistancesFallsFromTree /oranges distances at which each orange falls from the tree.
 * 
 * Output => Print two integers on two different lines:
    1. The first integer: the number of apples that fall on Sam's house.
    2. The second integer: the number of oranges that fall on Sam's house.
 */
function countApplesAndOranges(s, t, a, b, apples, oranges) {
  let appleFallsInRange = apples.map(apple => apple + a).filter(p => p >= s && p <= t).length;
  let orangeFallsInRange = oranges.map(orange => orange + b).filter(p => p >= s && p <= t).length;
  console.log(`${appleFallsInRange}`);
  console.log(`${orangeFallsInRange}`);
}

let s = 7;
let t = 11;
let a = 5;
let b = 15;
let m = 3;
let n = 2;
let apples = [-2, 2, 1];
let oranges = [5, -6];
countApplesAndOranges(s, t, a, b, apples, oranges);
