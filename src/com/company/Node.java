package com.company;

import java.util.Collection;

public interface Node<T extends Number> extends Wrapper<T> {
    Node<T> getParent();
    Collection<Node<T>> getChildren();
    void print(int indents);
}
