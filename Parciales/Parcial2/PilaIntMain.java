package Parciales.Parcial2;

/* TEMA 2: Desde el método main, dadas dos Pilas de Caracteres P1 y P2 de igual cantidad
de elementos, generar una Cola de Caracteres Q1 resultante de intercalar los elementos 
de ambas colas, de modo que las Pilas queden como estaban originalmente. */

public class PilaIntMain {
    public static void main(String[] args) {

        PilaInt P1 = new PilaInt(5);
        PilaInt P2 = new PilaInt(5);

        int[] Q1 = new int[10];
        int finQ1 = 0;

        P1.apilar(1);
        P1.apilar(2);
        P1.apilar(3);
        P1.apilar(4);
        P1.apilar(5);

        P2.apilar(6);
        P2.apilar(7);
        P2.apilar(8);
        P2.apilar(9);
        P2.apilar(10);

        boolean resultado = P1.masElementosPares(P2);
        System.out.println("La pila 1 tiene más elementos pares que la pila 2 = " + resultado);
        System.out.println();

        //Pilas 1 y 2 intercaladas en cola q1
        PilaInt auxP1 = new PilaInt(5);
        PilaInt auxP2 = new PilaInt(5);
        while (!P1.estaVacia() && !P2.estaVacia()) {
            int elemP1 = P1.desapilar();
            Q1[finQ1] = elemP1;
            finQ1++;
            auxP1.apilar(elemP1);

            int elemP2 = P2.desapilar();
            Q1[finQ1] = elemP2;
            finQ1++;
            auxP2.apilar(elemP2);
        }

        //restaurar P1 y P2
        while (!auxP1.estaVacia()) {
            P1.apilar(auxP1.desapilar());
        }
        while (!auxP2.estaVacia()) {
            P2.apilar(auxP2.desapilar());
        }
    }
}