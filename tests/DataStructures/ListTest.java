package DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {
List list;
    @BeforeEach
    void setUp() {
        list = new ArrayList();

    }
    @Test
    void testListIsNotEmpty(){
        assertNotNull(list);
    }
    @Test
    void testListIsEmpty(){
        assertTrue(list.isEmpty());
    }
    @Test
    void addItem_listIsEmptyTest(){
        list.add("Element");

        assertFalse(list.isEmpty());

    }
    @Test
    void addItem_removeItem_listIsEmptyTest(){
        list.add("Element");
//        list.add("Beans");
        list.remove("Element");
        String arr =  list.get(0);
        System.out.println(arr);
        assertTrue(list.isEmpty());

    }
    @Test
    void addX_Y_andZ_removeX_getXShouldReturn(){
        list.add("G-st");
        list.add("A-st");
        list.add("F-st");
        list.add("D-st");
        list.add("C-st");
        list.add("B-st");
        list.remove("B-st");
        String pick = list.get(4);
        System.out.println(pick);
        assertEquals("C-st",pick);


    }
    @Test
    void addXandY_retrieveXTest(){
        list.add("Oat");
        list.add("Wheat");
//        assertTrue(list.capacity());
    }

    @Test
    public void addSixElement_capacityShouldDoubleTest(){
        assertEquals(5,list.capacity());

        list.add("G-st");
        list.add("G-st");
        list.add("G-st");
        list.add("G-st");
        list.add("G-st");
        list.add("G-st");

        assertEquals(10,list.capacity());
    }

}
