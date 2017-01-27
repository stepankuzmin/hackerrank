// https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks

const queue = [];

function processData(input) {
  const [command, argument] = input.split(' ');
  switch (command) {
    case '1': queue.push(argument); break;
    case '2': queue.shift(); break;
    case '3': console.log(queue[0]); break;
    default: throw new Error(`Unknown command ${command}`);
  }
}

process.stdin.resume();
process.stdin.setEncoding('ascii');
_input = '';
process.stdin.on('data', function (input) {
  _input += input;
});

process.stdin.on('end', function () {
  _input.split('\n').slice(1).forEach(processData);
});
