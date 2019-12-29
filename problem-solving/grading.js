/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 *
 * Rules
 *  1. Every student receives a grad in the inclusive range from  to.
 *  2. Any  grade less than 40 is a failing grade.
 */

function gradingStudents(grades) {
  let result = [];
  var multipleToRoundTo = 5;
  var numberToRoundAt = 3;
  const round5 = grade => Math.ceil(grade / 5) * 5;
  const conditionToRound =
    Math.ceil(grade / multipleToRoundTo) * multipleToRoundTo - grade < numberToRoundAt;
  grades.forEach(grade => {
    if (grade >= 38 && conditionToRound) result.push(round5(grade));
    else result.push(grade);
  });
  return result;
}

let grades = [73, 67, 38, 33];
const result = gradingStudents(grades);

console.log(result);
