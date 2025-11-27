package Parciales.Parcial2.Recuperatorio;

/* 1. Dada una pila de elementos enteros, eliminar los elementos duplicados consecutivos.
La pila debe quedar con los valores originales sin los elementos duplicados. */

public class MainPila {
    public static void main(String[] args) {

        Pila pila = new Pila(10);
        pila.apilar(8);
        pila.apilar(8);
        pila.apilar(53);
        pila.apilar(5);
        pila.apilar(7);
        pila.apilar(7);
        pila.apilar(16);

        Pila pilaAux = new Pila(10);
        while (!pila.estaVacia()) {
            int valorActual = pila.desapilar();
            if (!pila.estaVacia() && pila.getDatos()[pila.getTope()] == valorActual) {
                pila.desapilar();
            } else {
                pilaAux.apilar(valorActual); //si no es igual lo apila aca
            }
        }
        
        while (!pilaAux.estaVacia()) {
            pila.apilar(pilaAux.desapilar());
        }

        //muestra
        System.out.println("Pila sin elementos duplicados consecutivos: ");
        while (!pila.estaVacia()) {
            System.out.println(pila.desapilar());
        }

    }
}