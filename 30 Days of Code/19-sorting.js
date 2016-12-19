// https://www.hackerrank.com/challenges/30-sorting

function main() {
  var n = parseInt(readLine());
  a = readLine().split(' ');
  a = a.map(Number);
  var tmp;
  var numberOfSwaps = 0;
  for (var i = 0; i < n; i++) {
    for (var j = 0; j < n - 1; j++) {
      if (a[j] > a[j + 1]) {
        tmp = a[j];
        a[j] = a[j + 1];
        a[j + 1] = tmp;
        numberOfSwaps++;
      }
    }

    if (numberOfSwaps == 0) break;
  }

  console.log(`Array is sorted in ${numberOfSwaps} swaps.`);
  console.log(`First Element: ${a[0]}`);
  console.log(`Last Element: ${a[a.length-1]}`);
}
