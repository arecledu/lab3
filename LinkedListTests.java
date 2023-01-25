import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTests {
    @Test
    public void testAppend() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(4);
        linkedList.append(1);
        linkedList.append(3);
        assertEquals("4 1 3 ", linkedList.toString());
    }
    @Test
    public void testEmptyFirst() {
        LinkedList linkedList = new LinkedList();
        assertEquals(null, linkedList.first());
    }


}
