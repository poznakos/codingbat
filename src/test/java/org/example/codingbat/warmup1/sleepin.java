package org.example.codingbat.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sleepin {

    public boolean implementation(boolean weekday, boolean vacation){
        return implementation4(weekday,vacation);
    }

    public boolean implementation1(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean implementation2(boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            return true;
        } else {
            return false;
        }
    }

    public boolean implementation3(boolean weekday, boolean vacation) {
        if(weekday){
            if(vacation){
                // 1 / 1
                return true;
            } else {
                // 1 / 0
                return false;
            }
        } else {
            if(vacation){
                // 0 / 1
                return true;
            } else {
                // 0 / 0
                return true;
            }
        }
    }

    public boolean implementation4(boolean weekday, boolean vacation) {
        if(weekday && !vacation){
            return false;
        }

        return true;
    }

    @Test
    void when_false_and_false_return_true(){
        assertEquals(implementation(false,false),true);
    }

    @Test
    void when_true_and_false_return_false(){
        assertEquals(implementation(true,false),false);
    }

    @Test
    void when_false_and_true_return_true(){
        assertEquals(implementation(false,true),true);
    }

    @Test
    void when_true_and_true_return_true(){
        assertEquals(implementation(true,true),true);
    }
}
