// https://www.hackerrank.com/challenges/2d-array

const hourglassPattern = [
  [true, true, true],
  [false, true, false],
  [true, true, true]
];

function getHourglassSum(arr, [x, y]) {
  const sum = hourglassPattern.reduce((yAcc, row, yIndex) => {
    return (
      yAcc +
      row.reduce((xAcc, match, xIndex) => {
        return match ? xAcc + arr[y + yIndex][x + xIndex] : xAcc;
      }, 0)
    );
  }, 0);

  return sum;
}

function hourglassSum(arr) {
  const hourglassesInRows = arr.length - hourglassPattern.length;
  const hourglassesInColumns = arr[0].length - hourglassPattern[0].length;

  let hourglassSums = [];
  for (let x = 0; x <= hourglassesInRows; x++) {
    for (let y = 0; y <= hourglassesInColumns; y++) {
      const sum = getHourglassSum(arr, [x, y]);
      hourglassSums.push(sum);
    }
  }

  return Math.max(...hourglassSums);
}
