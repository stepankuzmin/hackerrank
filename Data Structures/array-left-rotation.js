// https://www.hackerrank.com/challenges/array-left-rotation

function rotateLeft(d, list) {
    const head = list.slice(0, d);
    const tail = list.slice(d, list.length);
    return tail.concat(head);
}
