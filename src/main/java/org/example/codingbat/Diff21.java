package org.example.codingbat;

public class Diff21 {
    public int diff21(int n) {
        if (n > 21) {
            return Math.abs((21-n)*2);
        }
        return 21 - n;
    }


}
