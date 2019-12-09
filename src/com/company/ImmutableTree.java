package com.company;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class ImmutableTree extends AbstractTree  {

    public ImmutableTree(Node root, BinaryOperator adder, Comparator comparator, Number zero) {
        super(root, adder, comparator, zero);
    }

    public AbstractTree removeSubtree(Node rootSubtree) {
        return null;
    }

    public AbstractTree maximize(int k) {
        return null;
    }

    public AbstractTree maximize() {
        return null;
    }
}
