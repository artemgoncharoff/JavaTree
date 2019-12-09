package com.company;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.BinaryOperator;

public abstract class AbstractTree<T extends Number> {

    private Node<T> root;
    private BinaryOperator<T> adder;
    private T sum;
    private Comparator<T> comparator;
    private T zero;

    public AbstractTree(Node<T> root, BinaryOperator<T> adder, Comparator<T> comparator, T zero){
        this.root = root;
        this.adder = adder;
        this.comparator = comparator;
        this.zero = zero;
    }
    //Getters
    public Node<T> getRoot(){
        return root;
    }

    public int getSize(){
        int count = 1;
        Node<T> top = root;
        Queue<Node<T>> queue = new LinkedList<>();
        do{
            if (top.getChildren().size() !=0 ){
                queue.addAll(top.getChildren());
                count += top.getChildren().size();
            }
            if (!queue.isEmpty()) top = queue.poll();
        }while (!queue.isEmpty() || top.getChildren().size() != 0);
        return count;
    }

    public T getSum(){
        sum = root.getValue();
        Node<T> top = root;
        Queue<Node<T>> queue = new LinkedList<>();
        do{
            for (var node: top.getChildren()){
                if(node.getChildren().size() != 0){
                    adder.apply(sum, node.getValue());
                    queue.add(node);
                }
                else adder.apply(sum, node.getValue());
            }
            if (!queue.isEmpty()) top = queue.poll();
        }while (!queue.isEmpty());
        return sum;
    }

    public abstract AbstractTree<T> removeSubtree(Node<T> rootSubtree);

    public abstract AbstractTree<T> maximize(int k);

    public abstract AbstractTree<T> maximize();




}
