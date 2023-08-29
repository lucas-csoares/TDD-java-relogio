package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Relogio;
import org.junit.jupiter.api.Test;


public class RelogioTest {

    @Test
    public void testHora() {
        Relogio relogio = new Relogio();
        String difTime = relogio.difTime("10:30:10","15:45:15");
        assertEquals("05:15:05", difTime);
    }
}


