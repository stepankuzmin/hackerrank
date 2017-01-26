// https://www.hackerrank.com/challenges/ctci-balanced-brackets

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

const isBalanced = (string) => {
  const stack = [];
  const pairs = { '}': '{', ')': '(', ']': '[', };
  const brackets = ['{', '}', '(', ')', '[', ']'];

  string.split('').forEach(symbol => {
    if (brackets.includes(symbol)) {
      if (pairs[symbol] && pairs[symbol] === stack[stack.length - 1]) {
        stack.pop();
      } else {
        stack.push(symbol);
      }
    }
  });

  return stack.length === 0;
}

function main() {
  var t = parseInt(readLine());
  for(var a0 = 0; a0 < t; a0++){
    var expression = readLine();
    if (isBalanced(expression)) {
      console.log('YES');
    } else {
      console.log('NO');
    }
  }
}
