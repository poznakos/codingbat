package org.example.codingbat;


public class MissingChar {


    public String missingChar(String str, int n) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.deleteCharAt(n).toString();
    }


}
