package org.example;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Relogio {

    public String difTime(String horario1, String horario2) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime1 = LocalTime.parse(horario1,formatter);
        LocalTime localTime2 = LocalTime.parse(horario2,formatter);
        Duration duracao = Duration.between(localTime1, localTime2);

        long totalSegundos = duracao.getSeconds();
        long horas = totalSegundos / 3600;
        long minutos = (totalSegundos%3600) / 60;
        long segundos = (totalSegundos%3600) % 60;

       return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
