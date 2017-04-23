# https://www.hackerrank.com/challenges/ctci-is-binary-search-tree

""" Node is defined as
class node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
"""

def check_bst(root, mmin, mmax):
    if not root:
        return True

    return (mmin < root.data) and (root.data < mmax) and \
        check_bst(root.left, mmin, root.data) and \
        check_bst(root.right, root.data, mmax)

def check_binary_search_tree_(root):
    return check_bst(root, 0, 10000)
