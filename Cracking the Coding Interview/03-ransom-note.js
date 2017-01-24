// https://www.hackerrank.com/challenges/ctci-ransom-note

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

const countFrequencies = (frequencies, word) => {
  if (!frequencies[word]) {
    frequencies[word] = 1;
  } else {
    frequencies[word] += 1;
  }
  return frequencies;
}

const getFrequencies = (words) =>
  words.reduce(countFrequencies, {});

const includesFrequency = (frequency1, frequency2) => {
  return Object.keys(frequency2).every(key => {
    const value1 = frequency1[key];
    const value2 = frequency2[key];
    return value1 && value1 >= value2;
  });
}

function main() {
    var m_temp = readLine().split(' ');
    var m = parseInt(m_temp[0]);
    var n = parseInt(m_temp[1]);
    magazine = readLine().split(' ');
    ransom = readLine().split(' ');

    if (includesFrequency(getFrequencies(magazine), getFrequencies(ransom))) {
      console.log('Yes');
    } else {
      console.log('No');
    }
}
