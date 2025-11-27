package Parciales.Parcial2.Recuperatorio;
public class Pila {

    private int[] datos;
    private int tope;
    private final int MAX;

    public Pila(int tamaño) {
        MAX = tamaño;
        datos = new int[MAX];
        tope = -1; // Pila vacía
    }

    //getters y setters
    public int[] getDatos() {
        return datos;
    }
    public void setDatos(int[] datos) {
        this.datos = datos;
    }

    public int getTope() {
        return tope;
    }
    public void setTope(int tope) {
        this.tope = tope;
    }

    public int getMAX() {
        return MAX;
    }

    //m[etodos
    /* Devuelve true si la pila está vacía */
    public boolean estaVacia() {
        return tope == -1;
    }

    /* Devuelve true si la pila está llena */
    public boolean estaLlena() {
        return tope == MAX - 1;
    }

    /* Inserta un elemento en la parte superior (apilar) */
    public boolean apilar(int valor) {
        if (estaLlena()) {
            // No se puede apilar más elementos
            return false;
        } else {
            tope++;
            datos[tope] = valor;
            return true;
        }
    }

    /* Elimina y devuelve el elemento del tope (desapilar) */
    public int desapilar() {
        if (estaVacia()) {
            // No hay elementos para desapilar
            return -1;
        } else {
            int valor = datos[tope];
            tope--;
            return valor;
        }
    }
}
