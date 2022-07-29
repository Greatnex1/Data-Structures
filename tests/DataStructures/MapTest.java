package DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {
    Map map;

    @BeforeEach
     void up (){
        map = new NewMap();
        }

@Test
 void testMapIsNotEmpty(){
    assertNotNull(map);

}
@Test
    void testMapCanBeCreated(){
        map.containsKey("Snacks");
       map.containsKey("Snacks");
        assertTrue(map.isEmpty());
}
    @Test
    void testKeyAndValueCanBeAccessedByMap(){
        map.keep("Orange",1);
        assertTrue(map.containsKey("Orange"));

    }
    @Test
    void testMapSizeCanIncrease() {
        map.keep("Orange", 1);
        map.keep("Mango", 2);
        map.keep("Apple", 3);
        assertEquals(3,map.size());
    }

    }