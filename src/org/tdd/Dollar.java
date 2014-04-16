package org.tdd;

/**
 * Created by czerwint on 15.04.14.
 */
public class Dollar extends Money{

    public Dollar(int amount) {
        super(amount);
    }

    public Dollar times(int multiplication) {
        return new Dollar ( amount *  multiplication );
    }

    public boolean equals(Object object){
        Dollar dollar = (Dollar)object;
        return amount == dollar.amount;
    }

}
