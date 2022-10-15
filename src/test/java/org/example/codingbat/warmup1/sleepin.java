package org.example.codingbat.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class sleepin {

    public boolean implementation(boolean weekday, boolean vacation) {
        return false;
    }

    @Test
    void tests(){
        assertAll("test",
            () -> assertEquals(implementation(false,false),false)
        );
    }

}
