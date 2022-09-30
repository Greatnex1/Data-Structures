package DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListOneTest {
LinkedListOne links;
    @BeforeEach
    void setUp() {
        links = new LinkedListOne();

    }
    @Test
     void testLinkedLIsNotEmpty(){
        assertNotNull(links);
    }
}