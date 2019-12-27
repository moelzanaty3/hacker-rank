function staircase(numberOfStairs) {

    let stair = '#';
    let space = ' ';
    for (let index = 1; index < numberOfStairs; index++) {
        console.log((space.repeat(numberOfStairs-index)).concat(stair.repeat(index)))
    }
}

staircase(6);