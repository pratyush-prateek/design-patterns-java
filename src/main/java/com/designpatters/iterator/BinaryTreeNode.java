package com.designpatters.iterator;

public class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode left;
    BinaryTreeNode right;
    public BinaryTreeNode() {}
    public BinaryTreeNode(T data) {
        this.data = data;
    }
}
