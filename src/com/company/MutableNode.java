package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class MutableNode<T extends Number> implements Node<T> {

    //Fields
    private T value = null;
    private MutableNode<T> parent = null;
    private Collection<Node<T>> children = new ArrayList<>();

    public MutableNode(){

    }
    public MutableNode(T value, MutableNode<T> parent){
        this.value = value;
        this.parent = parent;
    }
    /**
     * Set value
     * @param value
     */
    public void setValue(T value){
        this.value = value;
    }

    /**
     * Set parent
     * @param parent
     */
    public void setParent(MutableNode<T> parent){
        this.parent = parent;
    }
    /**
     *
     * @param children
     */
    public void setChildren(Collection<MutableNode<T>> children){
        this.children.addAll(children);
    }
    /**
     *
     * @param child
     */
    public void addChild(MutableNode<T> child){
        this.children.add(child);
    }
    /**
     *
     * @param child
     */
    public void removeChild(MutableNode<T> child){
        this.children.remove(child);
    }

    /**
     *
     * @return
     */
    public Node<T> getParent() {
        return parent;
    }

    /**
     *
     * @return
     */
    public Collection<Node<T>> getChildren() {
        return children;
    }

    public void print(int indents) {
        String result = "";
        for (int i = 0; i < indents; i++){
            result += " ";
        }
        System.out.println(result + value);
    }

    public T getValue() {
        return value;
    }
}
