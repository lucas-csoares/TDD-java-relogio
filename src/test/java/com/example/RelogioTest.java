package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.Relogio;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;


public class RelogioTest {

    @Test
    @DisplayName("Validar método função cronômetro")
    public void testDifTime() {
        Relogio relogio = new Relogio();
        String difTime = relogio.difTime("10:30:10","15:45:15");
        assertEquals("05:15:05", difTime);
    }

    @Test
    @DisplayName("Validar método de ajuste do relógio")
    public void testAjustar() {
        Relogio relogio = new Relogio();
        assertThrows(IllegalArgumentException.class, () -> {
            relogio.ajustar(-1, -30, -45);
        });
    }

    @Test
    @DisplayName("Validar método atualizar relógio para hora atual")
    public void testAtualizarHora() {
        Relogio relogio = new Relogio();
        relogio.atualizar();
        assertEquals(Integer.valueOf(LocalTime.now().getHour()), relogio.getHora());
        assertEquals(Integer.valueOf(LocalTime.now().getMinute()), relogio.getMinuto());
        assertEquals(Integer.valueOf(LocalTime.now().getSecond()), relogio.getSegundo());
    }



}


