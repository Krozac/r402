import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;


public class TP1Tests {

    // dans JUnit 5, un test est simplement une méthode de type void, marquée avec le tag @Test
    // elle peut avoir n'importe quel nom
    @Test
    void simpleTest() {
        // pour être utile, un test doit comporter au moins une assertion qui vérifie une propriété
        String s = "st" + "ring";
        // cette assertion vérifie que le deuxième argument est égal au premier (le résultat attendu)
        assertEquals("string", s);
    }

    @Test
    public void testOverArrays() {
        int[] a = {3, 2, 1};
        int[] expected = {1, 2, 3};

        Arrays.sort(a);
        // cette assertion permet de tester que deux tableaux ont le même contenu
        assertArrayEquals(a, expected);
    }
    
    @Test
    public void testIndexOfLastOccurrenceOk() {
    	int[] a = {};
    	int expected = -1;
    	
    	assertEquals(TP1.indexOfLastOccurrence(a,8),expected);
    }
    
    @Test
    public void testIndexOfLastOccurrenceDefaut() {
    	int[] a = {3,4,8,9};
    	int expected = -1;
    	assertEquals(TP1.indexOfLastOccurrence(a,2),expected);
    }
    
    @Test
    public void testIndexOfLastOccurrenceDefaillance() {
    	int[] a = {3};
    	int expected = 0;
    	assertEquals(TP1.indexOfLastOccurrence(a,3),expected);
    }
    
   
    @Test
    public void testCountOddElementsOk() {
    	int[] a = {3,4,8,9};
    	int expected = 2;
    	assertEquals(TP1.countOddElements(a),expected);
    }
    
    @Test
    public void testCountOddElementsDefaut() {
    	int[] a = {-3,4,8,-9};
    	int expected = 0;
    	assertEquals(TP1.countOddElements(a),expected);
    }
    
    @Test
    public void testCountOddElementsDefaillance() {
    	int[] a = {-3,4,8,-9};
    	int expected = 2;
    	assertEquals(TP1.countOddElements(a),expected);
    }
    
    @Test
    public void testAverageOk() {
    	int[] a = {};
    	int expected = 0;
    	assertEquals(TP1.average(a),expected);
    }
    
    @Test
    public void testAverageDefaut() {
    	int[] a = {3,4,8,9};
    	double expected = 6;
    	assertEquals(TP1.average(a),expected);
    }
    
    @Test
    public void testAverageDefaillance() {
    	int[] a = {2,4,8,9};
    	double expected = 5.75;
    	assertEquals(TP1.average(a),expected);
    }

}
