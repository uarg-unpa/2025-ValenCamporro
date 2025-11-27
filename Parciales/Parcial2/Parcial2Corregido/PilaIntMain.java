package Parciales.Parcial2.Parcial2Corregido;

/* TEMA 2: Desde el método main, dadas dos Pilas de Caracteres P1 y P2 de igual cantidad
de elementos, generar una Cola de Caracteres Q1 resultante de intercalar los elementos 
de ambas colas, de modo que las Pilas queden como estaban originalmente. */

public class PilaIntMain {
    public static void main(String[] args) {

        PilaInt P1 = new PilaInt(5);
        PilaInt P2 = new PilaInt(5);

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
        ColaInt Q1 = new ColaInt(10);
        PilaInt aux1 = new PilaInt(5);
        PilaInt aux2 = new PilaInt(5);

        while (!P1.estaVacia() && !P2.estaVacia()) {
            int elemP1 = P1.desapilar();
            Q1.encolar(elemP1);
            aux1.apilar(elemP1);

            int elemP2 = P2.desapilar();
            Q1.encolar(elemP2);
            aux2.apilar(elemP2);
        }

        //restaurar P1 y P2
        while (!aux1.estaVacia()) {
            P1.apilar(aux1.desapilar());
        }
        while (!aux2.estaVacia()) {
            P2.apilar(aux2.desapilar());
        }
    }
}