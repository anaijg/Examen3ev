package ejercicio03;

import java.time.LocalDate;

public class Corredor extends Participante{
    private int dorsal;
    private int tiempo;

    public Corredor(String dni, LocalDate fechaDeNacimiento) {
        super(dni, fechaDeNacimiento);
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String convertirTiempo() {
        int horas = tiempo / 60;
        String hhmm;
        if (horas < 10) {
            hhmm = "0" + String.valueOf(horas);
        } else {
            hhmm = String.valueOf(horas);
        }
        int minutos = tiempo % 60;
        if (minutos < 10) {
            hhmm = hhmm + ":0" + String.valueOf(minutos);
        } else {
            hhmm = hhmm + ":" + String.valueOf(minutos);
        }
        return hhmm;
    }

    @Override
    public String toString() {
        return " dorsal " + dorsal + "\t" + dni + "\ttiempo: " +  convertirTiempo() + " " ;
    }
}
