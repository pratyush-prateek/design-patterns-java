package com.designpatters.iterator;

import java.util.Stack;

public class InorderTraversalIterator<T> implements Iterator {
    private BinaryTreeNode<T> root;
    private Stack<BinaryTreeNode<T>> stack;
    public InorderTraversalIterator(BinaryTreeNode<T> root) {
        this.root = root;
        this.stack = new Stack<>();
        this.fillStack(this.root);
    }

    private void fillStack(BinaryTreeNode<T> node) {
        while(node != null) {
            this.stack.push(node);
            node = node.left;
        }
    }

    @Override
    public void next() {
        BinaryTreeNode<T> curr = this.stack.pop();
        System.out.println(curr.data.toString());
        this.fillStack(curr.right);
    }

    @Override
    public boolean hasNext() {
        return this.stack.size() > 0;
    }
}
