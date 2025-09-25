package Punto3;
import java.util.Scanner;

/* Realice un programa que dado el ingreso de una palabra como cadena de caracteres, permita visualizarla
en forma inversa. */

public class palabraInversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine().toLowerCase();

        char[] pila = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            pila[i] = palabra.charAt(i);
        }

        System.out.print("Palabra invertida: ");
        for (int i = palabra.length() - 1; i >= 0; i--) {
            System.out.print(pila[i]);
        }

        scanner.close();
    }
}