import com.company.AbstractTree;
import com.company.MutableNode;
import com.company.MutableTree;
import com.company.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BinaryOperator;

import static org.junit.jupiter.api.Assertions.*;

class AbstractTreeTest {

    @Test
    void getRoot() {
    }

    @Test
    void getSize() {
        MutableNode<Integer> root = new MutableNode<>();
        MutableNode<Integer> currentNode = new MutableNode<>(null, root);
        root.addChild(currentNode);
        for(int i = 0; i < 10; i ++){
            MutableNode<Integer> newNode = new MutableNode<>(null, currentNode);
            currentNode.addChild(newNode);
            currentNode = newNode;
        }

        BinaryOperator<Integer> adder = (a, b)->a + b;
        Comparator<Integer> comparator = (a, b) -> a>b ? a : b;
        MutableTree<Integer> tree = new MutableTree<>(root, adder, comparator, 0);
        int size = tree.getSize();
        assertEquals(10, tree.getSize());
    }

    @Test
    void getSum() {
    }

    @Test
    void removeSubtree() {
    }

    @Test
    void maximize() {
    }

    @Test
    void testMaximize() {
    }
}