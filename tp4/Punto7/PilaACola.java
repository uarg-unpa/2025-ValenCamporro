package tp4.Punto7;

/* 7. Se tiene una pila de enteros positivos. Con las operaciones básicas de pilas y colas,
escribir un programa que coloque todos los elementos pares de la pila en la cola. */

public class PilaACola {
    public static void main(String[] args) {
        
        int[] pila = {1, 2, 3, 4, 5, 6};
        int indicePila = pila.length - 1;

        int[] cola = new int[pila.length]; //tamaño igual al de la pila
        int finCola = 0;

        int[] pilaAux = new int[pila.length]; // pila auxiliar
        int indiceAux = -1;

        System.out.println("Pila original: ");
        for (int i = 0; i <= indicePila; i++) {
            System.out.print(pila[i] + " ");
        }
        System.out.println();

        while (indicePila >= 0) {
            int elemento = pila[indicePila]; // desapilar
            indicePila--;
            if (elemento % 2 == 0) {
                // encolar (agregar al final de la cola)
                cola[finCola] = elemento;
                finCola++;
            } else {
                // Apilar en pila auxiliar
                indiceAux++;
                pilaAux[indiceAux] = elemento;
            }
        }

        // pasar la píla auxiliar a pila original
        for (int i = 0; i <= indiceAux; i++) {
            pila[i] = pilaAux[i];
        }
        indicePila = indiceAux;

        // mostrar (MAL)
        System.out.print("Cola con elementos pares: ");
        for (int i = 0; i < finCola; i++) {
            System.out.print(cola[i] + " ");
        }
        System.out.println();

        System.out.print("Pila final: ");
        for (int i = indicePila; i >= 0; i--) {
            System.out.print(pila[i] + " ");
        }
        System.out.println();
    }
}