package org.tdd;

import static junit.framework.Assert.*;
import org.junit.Test;

/**
 * Created by czerwint on 15.04.14.
 */
public class DollarTest {

    //DONE test multiplication $5 * 2  = $10
    //DONE Dollar side effects
    //DONE equals
    //TODO Make amount private
    //TODO $5 + 10 CHF = $10 if rate is 2 :1
    //TODO Money rounding?
    //TODO hashCode
    //TODO Equal null
    //TODO Equal object
    //TODO 5 CHF * 2 = 10CHF
    //TODO common equals
    //TODO common times


    @Test
    public void testEquals(){
        assertTrue(new Dollar(1).equals(new Dollar(1)));
        assertFalse(new Dollar(1).equals(new Dollar(2)));

    }

    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2) );
        assertEquals(new Dollar(15), five.times(3) );
    }
}
