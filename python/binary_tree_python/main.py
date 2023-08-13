"""
Binary tree I made with a python course on Udemy
"Write it, then learn it!" - Some dev probably
"""
from node import Node
from binary_tree import BinaryTree

# Test stuff
nums = [1, 4, 5, 7, 8, 10, 12, 16, 19, 21]

for num in nums:
    tree = BinaryTree(Node(num))


    tree.inorder()
