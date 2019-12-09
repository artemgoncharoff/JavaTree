import com.company.MutableNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MutableNodeTest {

    @Test
    void setValue() {
        MutableNode<Integer> node = new MutableNode<>();
        node.setValue(25);
        int expected = 25;
        int actual = node.getValue();
        assertEquals(expected, actual);
    }

    @Test
    void setParent() {
        MutableNode<Integer> nodeParent = new MutableNode<>();
        MutableNode<Integer> nodeChild = new MutableNode<>();
        nodeChild.setParent(nodeParent);

        assertEquals(nodeParent, nodeChild.getParent());
    }

    @Test
    void setChildren() {

    }

    @Test
    void addChild() {
    }

    @Test
    void removeChild() {
    }

    @Test
    void getParent() {
    }

    @Test
    void getChildren() {
    }

    @Test
    void print() {
    }

    @Test
    void getValue() {
        MutableNode<Integer> node = new MutableNode<>();
        node.setValue(25);
        int expected = 25;
        int actual = node.getValue();
        assertEquals(expected, actual);
    }
}