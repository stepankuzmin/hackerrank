// www.hackerrank.com/challenges/jumping-on-the-clouds

function jumpingOnCloudsRecur(clouds, index = 0, jumps = 0) {
  if (index === clouds.length - 1) {
    return jumps;
  }

  if (clouds[index + 2] === 0) {
    return jumpingOnCloudsRecur(clouds, index + 2, jumps + 1);
  } else {
    return jumpingOnCloudsRecur(clouds, index + 1, jumps + 1);
  }
}
