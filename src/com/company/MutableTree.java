package com.company;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.BinaryOperator;

public class MutableTree<T extends Number> extends AbstractTree<T> {

    public MutableTree(Node<T> root, BinaryOperator<T> adder, Comparator<T> comparator, T zero) {
        super(root, adder, comparator, zero);
    }

    public AbstractTree removeSubtree(Node rootSubtree) {

        Node<T> top = this.getRoot();
        Queue<Node<T>> queue = new LinkedList<>();
        do{
            if (top.getChildren().size() !=0 )
                queue.addAll(top.getChildren());
            if (!queue.isEmpty()) top = queue.poll();
        }while (!queue.isEmpty() && top != rootSubtree);

        if(top == rootSubtree){
            top = null;
        }
        return this;
    }

    public AbstractTree maximize(int k) {
        return null;
    }

    public AbstractTree maximize() {
        return null;
    }
}
