package org.tdd;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by czerwint on 15.04.14.
 */
public class FrancTest {


    @Test
    public void testEquals(){
        assertTrue(new Franc(1).equals(new Franc(1)));
        assertFalse(new Franc(1).equals(new Franc(2)));

    }

    @Test
    public void testMultiplication(){
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2) );
        assertEquals(new Franc(15), five.times(3) );
    }
}
