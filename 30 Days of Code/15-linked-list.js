// https://www.hackerrank.com/challenges/30-linked-list

function Solution() {
  this.insert=function(head, data) {
    if (head === null) {
      return new Node(data);
    }

    var current = head;
    while (current.next !== null) {
      current = current.next;
    }

    current.next = new Node(data);
    return head;
  };
}
