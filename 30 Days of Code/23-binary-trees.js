// https://www.hackerrank.com/challenges/30-binary-trees

levelOrder = function(root) {
  var current;
  var queue = [];
  var order = [];
  queue.push(root);
  while (queue.length > 0) {
    current = queue.shift();
    order.push(current.data);
    if (current.left) queue.push(current.left);
    if (current.right) queue.push(current.right);
  }
  console.log(order.join(' '));
}
