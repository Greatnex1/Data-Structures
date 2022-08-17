package DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
LinkedList links;
    @BeforeEach
    void setUp() {
        links = new LinkedList();

    }
    @Test
     void testLinkedLIsNotEmpty(){
        assertNotNull(links);
    }
}