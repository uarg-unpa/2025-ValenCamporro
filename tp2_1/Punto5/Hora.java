package tp2_1.Punto5;

/* Una hora se compone de 3 elementos: hora, minutos y segundos. Codificar la clase Hora. */

public class Hora {
    
    private int hora;
    private int minutos;
    private int segundos;

    public Hora(int hora, int minutos, int segundos) {
        validarHora(hora, minutos, segundos);
    }

    public void setHora(int h) {
        this.hora = h;
    }
    public int getHora() {
        return this.hora;
    }

    public void setMinutos(int m) {
        this.minutos = m;
    }
    public int getMinutos() {
        return this.minutos;
    }

    public void setSegundos(int s) {
        this.segundos = s;
    }
    public int getSegundos() {
        return this.segundos;
    }

    /* Cuando se crea el objeto de la clase Hora, los valores de hora, minutos y segundos deben ser
    válidos (es decir, una hora correcta en Argentina). Si alguno es inválido, generar la hora 00:00:00. */
    public void validarHora(int h, int m, int s) {
        if (h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59) {
            this.hora = h;
            this.minutos = m;
            this.segundos = s;
        } else {
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    /* Devolver la hora en minutos. */
    public int devolverMin() {
        return this.hora * 60 + this.minutos;
    }

    /* Mostrar la hora de la siguiente forma: hh:mm:ss. */
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hora, this.minutos, this.segundos); // (String.format hace un String usando un patrón)
    }
}