package com.designpatters.iterator;

public class Client {
    public static void main(String[] args) throws Exception {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.addNode(1);
        binaryTree.addNode(2);
        binaryTree.addNode(3);
        binaryTree.addNode(4);
        binaryTree.addNode(5);
        binaryTree.addNode(6);
        binaryTree.addNode(7);
        binaryTree.addNode(8);

        Iterator<Integer> binaryTreeIterator = binaryTree.getInorderTraversalIterator();
        while(binaryTreeIterator.hasNext())
            binaryTreeIterator.next();
    }
}
