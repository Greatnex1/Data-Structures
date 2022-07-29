package DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.naming.LimitExceededException;

import static org.junit.jupiter.api.Assertions.*;

class QueuesTest {
Queue test;
    @BeforeEach
    void setUp() {
        test = new Queues();
    }
    @Test
     void testQueueIsNotEmpty(){
        assertNotNull(test);
    }
    @Test
    void testQueueCanBeEmpty() {
        assertTrue(test.isEmpty());

    }
    @Test
    void testItemsCanBeAddedToQueue() throws LimitExceededException {
        test.add("Wheat");
        test.add("Max");
//        test.set(0,"Wheat");
//        test.set(1,"Beans");
        assertEquals(2,test.size());
    }
    @Test
     void testItemsCanBeGottenAtIndex(){
        test.set(0,"Ade");
        test.set(1,"Sammie");
        test.set(2,"Jane");
        System.out.println( test.get(2));
        assertEquals("Jane", test.get(2));
    }
    @Test
    void testItemsCanBeRemoved() throws LimitExceededException {
        test.add("Wheat");
        test.remove("Wheat");
        assertEquals(0,test.size());
    }
@Test
    void testQueueCanBeCleared(){
//    System.out.println(test.clear());
    test.clear();
//    test.add("Max");
//    test.add("Meat");
//    test.add("Ice");
//    test.remove("Max");
//assertEquals(0, test.clear());

}
@Test
    void testQueueCanHoldItems(){
      test.contains("Wheat");
        test.contains("Rice");
       assertTrue(test.contains("we"));
}


}