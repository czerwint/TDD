package org.tdd;

/**
 * Created by czerwint on 15.04.14.
 */
public class Franc extends Money {

    private int amount;

    public Franc(int amount) {
        this.amount = amount;

    }

    public Franc times(int multiplication) {
        return new Franc( amount *  multiplication );
    }

    public boolean equals(Object object){
        Franc dollar = (Franc)object;
        return amount == dollar.amount;
    }

}
