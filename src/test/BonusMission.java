package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BonusMission {

    private int [] arr;

    @Before
    public void setup () {
        arr = new int[] {1, 2, 3, 4, 5};
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void fourWorks () {
        assertEquals(4, BonusBinarySearch.binarySearch(arr,4));
    }

//    @Test
//    public void zeroFails () {
//        assertEquals(0, BonusBinarySearch.binarySearch(arr,0));
//    }



}
