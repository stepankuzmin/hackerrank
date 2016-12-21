// https://www.hackerrank.com/challenges/30-binary-search-trees

var getHeight = function(root) {
  var height = arguments[1] ? arguments[1] : 0;
  var leftHeight = rightHeight = height;
  if (root.left) {
    leftHeight = getHeight(root.left, height + 1);
  }
  if (root.right) {
    rightHeight = getHeight(root.right, height + 1);
  }

  return Math.max(leftHeight, rightHeight);
}
