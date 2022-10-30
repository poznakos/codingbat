package org.example.codingbat;

public class Posneg {
    public boolean posNeg(int a, int b, boolean negative) {
        boolean result = false;
        if(negative){
            if(a<0 && b<0){
                result = true;

            }
        } else{
            if(a<0 && b>0 || a>0 && b<0){
                result = true;
            }
        }
        return result;
    }
}
