package org.example.codingbat.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FrontBack {

    public String frontBack(String str) {
        if(str.length() == 1){
            return str;
        }
        else {
            String first;
            String middle;
            String last;
            int lenght;
            lenght = str.length();
            first = str.substring(0, 1);
            last = str.substring(str.length()-1, str.length());
            middle = str.substring(1, str.length()-1);
            String  result = last+middle+first;
            return result;
        }

    };


    @Test
    void test_if_last_and_first_char_where_switched() {

        assertEquals("eodc", frontBack("code"));

    }

    @Test
    void test_if_one__char_corect() {

        assertEquals("a", frontBack("a"));

    }

    @Test
    void test_if_two__char_will_be_switched() {

        assertEquals("ba", frontBack("ab"));

    }
}
