// https://www.hackerrank.com/challenges/30-linked-list-deletion

removeDuplicates = function (head) {
  if (head === null) {
    return head
  }

  var current = head;
  var previous = null;
  var values = [head.data];

  while (current.next !== null) {
    previous = current;
    current = current.next;
    if (values.includes(current.data)) {
      previous.next = current.next;
      current = previous;
    } else {
      values.push(current.data);
    }
  }

  return head;
}
