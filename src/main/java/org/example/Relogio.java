package org.example;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Relogio {
    private Integer hora;
    private Integer minuto;
    private Integer segundo;

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getMinuto() {
        return minuto;
    }

    public void setMinuto(Integer minuto) {
        this.minuto = minuto;
    }

    public Integer getSegundo() {
        return segundo;
    }

    public void setSegundo(Integer segundo) {
        this.segundo = segundo;
    }

    public void atualizar() {
        LocalTime horaAtual = LocalTime.now();

        Integer hora = Integer.valueOf(horaAtual.getHour());
        Integer minuto = Integer.valueOf(horaAtual.getMinute());
        Integer segundo = Integer.valueOf(horaAtual.getSecond());

        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    }

    public void ajustar(Integer hora, Integer minuto, Integer segundo) {
        boolean horarioCorreto = hora>=0 &&
                hora<=23 &&
                minuto>=0 &&
                minuto<=59 &&
                segundo>=0 &&
                segundo<=59;

        if(horarioCorreto) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else
            throw new IllegalArgumentException("valor inválido para horário");
    }
    public String difTime(String horario1, String horario2) {
        LocalTime localTime1, localTime2;
        localTime1 = stringParaLocalTime(horario1);
        localTime2 = stringParaLocalTime(horario2);

        Duration duracao = Duration.between(localTime1, localTime2);

        long totalSegundos = duracao.getSeconds();
        long horas = totalSegundos / 3600;
        long minutos = (totalSegundos%3600) / 60;
        long segundos = (totalSegundos%3600) % 60;

       return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    public LocalTime stringParaLocalTime (String horario) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.parse(horario,formatter);
        return localTime;
    }



}
