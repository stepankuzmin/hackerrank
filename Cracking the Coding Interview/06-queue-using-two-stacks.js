// https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks

class Queue {
  constructor() {
    this.inbox = [];
    this.outbox = [];
  }

  fillOutbox() {
    if (this.outbox.length === 0) {
      while (this.inbox.length !== 0) {
        this.outbox.push(this.inbox.pop())
      }
    }
  }

  enqueue(value) {
    this.inbox.push(value);
  }

  dequeue() {
    this.fillOutbox();
    return this.outbox.pop();
  }

  peek() {
    this.fillOutbox();
    return this.outbox[this.outbox.length - 1];
  }
}

const queue = new Queue();

const ENQUEUE = 1;
const DEQUEUE = 2;
const PRINT = 3;

function processData(input) {
  const [command, argument] = input.split(' ');
  switch (parseInt(command, 10)) {
    case ENQUEUE: queue.enqueue(argument); break;
    case DEQUEUE: queue.dequeue(); break;
    case PRINT: console.log(queue.peek()); break;
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
