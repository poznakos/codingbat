package org.example.codingbat.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class monkeyTrouble {

    public boolean implementation(boolean aSmile, boolean bSmile){
        return implementation2(aSmile,bSmile);
    }

    public boolean implementation1(boolean aSmile, boolean bSmile){
        if(!aSmile && bSmile){
            return false;
        }

        if(aSmile && !bSmile){
            return false;
        }

        return true;
    }

    public boolean implementation2(boolean aSmile, boolean bSmile){
        if(!aSmile && bSmile || aSmile && !bSmile){
            return false;
        }

        return true;
    }

    public boolean implementation3(boolean aSmile, boolean bSmile){
        if(monkeyAxorBisSmiling(aSmile,bSmile)){
            return false;
        }

        return true;
    }

    public boolean monkeyAxorBisSmiling(boolean aSmile, boolean bSmile){
        return !aSmile && bSmile || aSmile && !bSmile;
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
        assertEquals(implementation(false,true),false);
    }

    @Test
    void when_true_and_true_return_true(){
        assertEquals(implementation(true,true),true);
    }

}
