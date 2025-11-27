package tp4.Punto8;
import java.util.Scanner;

/* 8. Escribir un programa que lea una cadena de caracteres, metiendo cada carácter en una pila a
medida que se lee y añadiéndolo simultáneamente a una cola. Cuando se encuentre el final de la
cadena, utilice las operaciones básicas de pilas y colas para determinar si la cadena es un palíndromo. */

public class PilaYColaPal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String cadena = scanner.nextLine();
        
        int longitud = cadena.length();

        char[] pila = new char[longitud];
        char[] cola = new char[longitud];

        // índices
        int tope = -1;
        int fin = 0;

        // recorre la cadena y carga cada caracter en pila y cola
        for (int i = 0; i < longitud; i++) {
            char c = cadena.charAt(i);
            // apila
            tope++;
            pila[tope] = c;
            // encola
            cola[fin] = c;
            fin++;
        }

        // compara los caracteres desapilando y desencolando
        boolean esPalindromo = true;
        int frente = 0;

        while (tope >= 0 && frente < fin) {
            char desdePila = pila[tope];
            char desdeCola = cola[frente];
            if (desdePila != desdeCola) {
                esPalindromo = false;
            }
            // desapila y desencola
            tope--;
            frente++;
        }

        if (esPalindromo) {
            System.out.println("La palabra es palíndromo.");
        } else {
            System.out.println("La palabra no es palíndromo.");
        }

        scanner.close();
    }
}