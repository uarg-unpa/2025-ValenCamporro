package Parciales.Parcial2.Recuperatorio;

/* 2. Dada una cola de enteros, y un entero K, quitar k elementos para volverlos a colocar. 
Validar que K sea mas chica que la pila y mayor a 0. */

public class MainCola {
    public static void main(String[] args) {

        Cola cola = new Cola(10);
        cola.encolar(33);
        cola.encolar(4);
        cola.encolar(55);
        cola.encolar(61);
        cola.encolar(5);
        cola.encolar(10);
        cola.encolar(-6);

        int K = 4;
        int tamanio = cola.getUltimo() + 1;

        if (K <= 0 || K >= tamanio) {
            System.out.println("K debe ser mayor que 0 y menor que la cantidad de elementos en la cola.");
            return;
        }

        Cola colaAux = new Cola(10);

        for (int i = 0; i < K; i++) {
            int rotar = tamanio - i - 1; 
            for (int r = 0; r < rotar; r++) {
                cola.encolar(cola.desencolar());
            }
            colaAux.encolar(cola.desencolar());
        }

        Cola resultante = new Cola(10);

        //mueve los elementos de la cola auxiliar a la resultante
        while (!colaAux.estaVacia()) {
            resultante.encolar(colaAux.desencolar());
        }
        //mueve los elementos restantes de la cola original a la resultante
        while (!cola.estaVacia()) {
            resultante.encolar(cola.desencolar());
        }

        //muestra
        while (!resultante.estaVacia()) {
            System.out.println(resultante.desencolar());
        }
    }
}