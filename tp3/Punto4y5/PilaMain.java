package Punto4y5;

/* 6. Usar los métodos sacar(), meter(), estaVacia() para hacer las siguientes operaciones: */
// Complicadísimo

public class PilaMain {
    public static void main(String[] args) {
        
        Pila pila = new Pila(5);

        pila.meter('A');
        pila.meter('B');
        pila.meter('C');
        pila.meter('D');
        pila.meter('E');

        System.out.println("El elemento que está en la cima es: " + pila.elementoCima());

        /* a) Asignar a X el segundo elemento desde la parte superior de la pila, dejando la pila sin sus dos elementos
        de la parte superior. */
        char x;
        pila.sacar();
        x = pila.sacar(); 
        System.out.println("a) x = " + x);

        pila.meter('D');
        pila.meter('E');

        /* b) Asignar a X el segundo elemento desde la parte superior de la pila, sin modificarla. */
        Pila aux = new Pila(10);
        char primero = pila.sacar();
        aux.meter(primero);
        x = pila.sacar();
        aux.meter(x);

        while (!aux.estaVacia()) {
            pila.meter(aux.sacar());
        }
        System.out.println("b) x = " + x);

        /* c) Desde un entero positivo N, asignar a X el N-ésimo elemento desde la parte superior de la pila, dejando
        la pila sin sus N elementos de la parte superior. */
        int N = 3;
        x = '\0';
        for (int i = 1; i <= N; i++) {
            x = pila.sacar();
        }
        System.out.println("c) x = " + x);

        pila.meter('C');
        pila.meter('D');
        pila.meter('E');

        /* d) Dado un entero positivo N, asignar a X el N-ésimo elemento desde la parte superior de pila, sin modificarla. */
        N = 3;
        x = '\0';
        aux = new Pila(10);
        for (int i = 1; i <= N; i++) {
            char temp = pila.sacar();
            aux.meter(temp);
            if (i == N) {
                x = temp;
            }
        }
        while (!aux.estaVacia()) {
            pila.meter(aux.sacar());
        }
        System.out.println("d) x = " + x);

        /* e) Asignar a X el elemento fondo de la pila, dejando la pila vacía. */
        x = '\0';
        while (!pila.estaVacia()) {
            x = pila.sacar();
        }
        System.out.println("e) x = " + x);

        pila.meter('A');
        pila.meter('B');
        pila.meter('C');
        pila.meter('D');
        pila.meter('E');

        /* f) Asignar a X el elemento fondo de la pila, sin modificarla. */
        x = '\0';
        aux = new Pila(10);
        while (!pila.estaVacia()) {
            char temp = pila.sacar();
            aux.meter(temp);
            if (pila.estaVacia()) {
                x = temp;
            }
        }
        while (!aux.estaVacia()) {
            pila.meter(aux.sacar());
        }
        System.out.println("f) x = " + x);
    }
}