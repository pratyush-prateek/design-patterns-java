package com.designpatters.iterator;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {
    private BinaryTreeNode<T> root;
    public BinaryTree() {
    }

    //Adds node to the first empty child
    public void addNode(T data) {
        if(this.root == null)
            this.root = new BinaryTreeNode(data);
        else {
            BinaryTreeNode<T> newNode = new BinaryTreeNode(data);
            Queue<BinaryTreeNode<T>> queue = new LinkedList<>();
            queue.add(this.root);
            while(!queue.isEmpty()) {
                BinaryTreeNode<T> curr = queue.poll();

                if(curr.left == null) {
                    curr.left = newNode;
                    break;
                }

                if(curr.right == null) {
                    curr.right = newNode;
                    break;
                }

                queue.add(curr.left);
                queue.add(curr.right);
            }
        }
    }

    public BinaryTreeNode<T> getRoot() {
        return this.root;
    }

    //inorder traversal iterator
    public Iterator getInorderTraversalIterator() {
        return new InorderTraversalIterator<T>(this.root);
    }

}
