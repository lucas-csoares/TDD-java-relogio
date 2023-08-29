package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Relogio;
import org.junit.jupiter.api.Test;


public class RelogioTest {

    @Test
    public void testHora() {
        Relogio relogio = new Relogio();
        String difTime = relogio.difTime("10:30","15:45");
        assertEquals("5:15", difTime);
    }
}


