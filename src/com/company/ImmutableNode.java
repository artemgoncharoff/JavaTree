package com.company;

import java.util.Collection;
import java.util.function.Function;

public class ImmutableNode<T extends Number> implements Node {

    //Fields
    private T value;
    private ImmutableNode<T> parent;
    Collection<Node<T>> children;

    public ImmutableNode(T value,
                         ImmutableNode<T> parent,
                         Function<ImmutableNode<T>, Collection<? extends Node<T>>> childrenConstructor){

    }

    public Node<T> getParent() {
        return parent;
    }

    public Collection<Node<T>> getChildren() {
        return children;
    }

    public void print(int indents) {

    }

    public Number getValue() {
        return value;
    }
}
