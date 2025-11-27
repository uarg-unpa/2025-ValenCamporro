package Parciales.Parcial2.Parcial2Corregido;

public class ColaInt {

    private int[] cola;
    private int ultimo;
    private final int MAX;

    public ColaInt(int tamaño) {
        MAX = tamaño;
        cola = new int[MAX];
        ultimo = -1;
    }

    //getters y setters
    public int[] getDatos() {
        return cola;
    }
    public void setDatos(int[] cola) {
        this.cola = cola;
    }

    public int getUltimo() {
        return ultimo;
    }
    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }

    //métodos
    public boolean estaVacia() {
        return ultimo == -1;
    }

    public boolean estaLlena() {
        return ultimo == MAX - 1;
    }

    public boolean encolar(int valor) {
        if (estaLlena()) {
            return false;
        } else {
            ultimo++;
            cola[ultimo] = valor;
            return true;
        }
    }

    public int desencolar() {
        if (estaVacia()) {
            return -1;
        } else {
            int salida = cola[0];
            for (int i = 0; i < ultimo; i++) {
                cola[i] = cola[i + 1];
            }
            ultimo--;
            return salida;
        }
    }
}