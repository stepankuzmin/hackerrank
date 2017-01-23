// https://www.hackerrank.com/challenges/ctci-making-anagrams

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

const countFrequencies = (frequencies, letter) => {
  if (!frequencies[letter]) {
    frequencies[letter] = 1;
  } else {
    frequencies[letter] += 1;
  }
  return frequencies;
}

const getFrequencies = (string) =>
  string
    .split('')
    .reduce(countFrequencies, {});

const diffFrequencies = (frequency1, frequency2) => {
  const keys1 = Object.keys(frequency1);
  const keys2 = Object.keys(frequency2);

  let deletionsCount = 0;
  keys1.forEach(key1 => {
    const value1 = frequency1[key1];
    const value2 = frequency2[key1];
    if (value2) {
      deletionsCount += Math.abs(value1 - value2);
    } else {
      deletionsCount += value1;
    }
  });

  keys2.forEach(key2 => {
    const value1 = frequency1[key2];
    const value2 = frequency2[key2];
    if (!value1) {
      deletionsCount += value2;
    }
  });

  return deletionsCount;
}

function main() {
    var a = readLine();
    var b = readLine();
    var deletionsCount = diffFrequencies(getFrequencies(a), getFrequencies(b));
    console.log(deletionsCount);
}
