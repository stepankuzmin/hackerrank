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

class Heap {
  constructor(comp) {
    this.array = [];
    this.comp = (a, b) => a > b;
  }

  size() {
    return this.array.length;
  }

  push(value) {
    this.array.push(value);
    this.bubbleUp(this.array.length - 1);
  }

  pop() {
    if (this.array.length === 0) {
      return;
    }

    const value = this.array[0];
    const lastIndex = this.array.length - 1;
    this.array[0] = this.array[lastIndex];
    this.array.length = lastIndex;
    if (lastIndex > 0) {
      this.bubbleDown(0);
    }

    return value;
  }

  swap(a, b) {
    const temp = this.array[a];
    this.array[a] = this.array[b];
    this.array[b] = temp;
  }

  bubbleUp(pos) {
    if (pos <= 0) {
      return;
    }

    const parent = Math.floor((pos - 1) / 2);
    if (this.comp(this.array[pos], this.array[parent])) {
      this.swap(pos, parent);
      this.bubbleUp(parent);
    }
  }

  bubbleDown(pos) {
    const left = 2 * pos + 1;
    const right = left + 1;
    let largest = pos;
    if (left < this.array.length && this.comp(this.array[left], this.array[largest])) {
      largest = left;
    }
    if (right < this.array.length && this.comp(this.array[right], this.array[largest])) {
      largest = right;
    }
    if (largest != pos) {
      this.swap(largest, pos);
      this.bubbleDown(largest);
    }
  }
}

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
