package Parciales.Parcial2.Recuperatorio;

public class Cola {
    
    private int[] cola;
    private int ultimo;
    private final int MAX;

    public Cola(int tamaño) {
        MAX = tamaño;
        cola = new int[MAX];
        ultimo = -1;
    }

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
    public int getMAX() {
        return MAX;
    }

    /* Devuelve true si la cola no tiene elementos */
    public boolean estaVacia() {
        return ultimo == -1;
    }

    /* Devuelve true si la cola está llena (no se puede encolar más) */
    public boolean estaLlena() {
        return ultimo == MAX - 1;
    }

    /* Encola un elemento al final. Retorna true si se encola, false si está llena. */
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
