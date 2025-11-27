package Parciales.Parcial2.Parcial2Corregido;

/* TEMA 2: Crear un método dentro de la clase pila de enteros, que reciba otra pila de enteros P2 también,
calcule y retorne verdadero si la pila tiene más elementos pares que la pila P2 que se envía por 
parámetro o falso si PS tiene más elementos pares. Las pilas deben quedar como estaban originalmente. */

public class PilaInt {

    private int[] elementos;
    private int cantidad;

    public PilaInt(int capacidad) {
        elementos = new int[capacidad];
        cantidad = 0;
    }

    //getters y setters
    public int[] getElementos() {
        return elementos;
    }
    public void setElementos(int[] elementos) {
        this.elementos = elementos;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //métodos
    public boolean estaVacia() {
        return cantidad == 0;
    }

    public boolean estaLlena() {
        return cantidad == elementos.length;
    }

    public boolean apilar(int valor) {
        if (!estaLlena()) {
            elementos[cantidad] = valor;
            cantidad++;
            return true;
        } else {
            return false;
        }
    }

    public int desapilar() {
        if (!estaVacia()) {
            int valor = elementos[cantidad - 1];
            cantidad--;
            return valor;
        } else {
            return -1;   
        }
    }

    public int cantidadElementos() {
        return cantidad;
    }

    public boolean masElementosPares(PilaInt p2) {
        int contadorParesThis = 0;
        int contadorParesP2 = 0;
        PilaInt auxThis = new PilaInt(this.getElementos().length); // Esto estaba mal
        PilaInt auxP2 = new PilaInt(p2.getElementos().length);     // Esto estaba mal
        while (!this.estaVacia()) {
            int valor = this.desapilar();
            if (valor % 2 == 0) {
                contadorParesThis++;
            }
            auxThis.apilar(valor);
        }
        while (!p2.estaVacia()) {
            int valor = p2.desapilar();
            if (valor % 2 == 0) {
                contadorParesP2++;
            }
            auxP2.apilar(valor);
        }
        while (!auxThis.estaVacia()) {
            this.apilar(auxThis.desapilar());
        }
        while (!auxP2.estaVacia()) {
            p2.apilar(auxP2.desapilar());
        }
        return contadorParesThis > contadorParesP2;
    }
}