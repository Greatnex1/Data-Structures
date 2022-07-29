package DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {
    Sets meal;

    @BeforeEach
    void up() {
        meal = new Sets();

    }

    @Test
    void testSetIsNotEmpty() {
        assertNotNull(meal);
    }

    @Test
    void testSetCanBeAdded() {
        meal.add("Rice");
        assertFalse(meal.isEmpty());
    }

    @Test
    void testItemInSetCanBeRemoved() {
        meal.add("Meat");
        meal.remove("Meat");
        assertTrue(meal.isEmpty());
    }

    @Test
    void testSetCanHaveMoreThanOneElement() {
        meal.add("Fish");
        meal.add("Chicken");
        meal.add("Goat");
        meal.add("Egg");
        assertEquals(4, meal.size());
    }

    @Test
    void testSetSizeChangeWhenElementIsDeletedAfterAdding() {
        meal.add("Fish");
        meal.add("Chicken");
        meal.add("Goat");
        meal.remove("Egg");
        assertEquals(2, meal.size());

    }

    @Test
    void testSetCanVerifyAnItemExists() {
        meal.add("Fish");
        meal.add("Chicken");
        assertTrue(meal.contains("Fish"));
    }
    @Test

    void testSetCanVerifyAnItemDoesNotExists() {
        meal.add("Fish");
        meal.add("Chicken");
        assertFalse(meal.contains("Meat"));
    }
    @Test
    void testSetCannotDuplicateAnItem(){
        meal.add("Fish");
        meal.add("Chicken");
        meal.add("Goat");
        meal.add("Fish");
        meal.add("Chicken");
        meal.add("Goat");
        assertEquals(3, meal.size());

    }

}