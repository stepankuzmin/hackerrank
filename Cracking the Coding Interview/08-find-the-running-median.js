// https://www.hackerrank.com/challenges/ctci-find-the-running-median

process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

median = (list) => {
  const length = list.length;
  if (length === 1) {
    return list[0].toFixed(1);
  }

  const sortedList = list.sort((a, b) => a - b);
  if (length % 2 === 0) {
    const index = length / 2;
    return ((sortedList[index - 1] + sortedList[index]) / 2).toFixed(1);
  } else {
    const index = Math.ceil(length / 2) - 1;
    return sortedList[index].toFixed(1);
  }
}

function main() {
    var n = parseInt(readLine());
    var a = [];
    for(var a_i = 0; a_i < n; a_i++){
       a[a_i] = parseInt(readLine());
       console.log(median(a));
    }

}
