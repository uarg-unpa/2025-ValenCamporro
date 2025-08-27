package tp1;
import java.util.Scanner;

/* Leer tres números enteros dentro de las variables NUM1, NUM2 y NUM3 respectivamente y calcular e
imprimir el producto y la suma de ellos. */

public class Punto6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese tres números enteros.");
        System.out.println("Número 1: ");
        int NUM1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Número 2: ");
        int NUM2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Número 3: ");
        int NUM3 = scanner.nextInt();
        scanner.nextLine();

        int producto = NUM1 * NUM2 * NUM3;
        int suma = NUM1 + NUM2 + NUM3;

        System.out.println("El producto de los números ingresados: " + producto);
        System.out.println("La suma de los números ingresados: " + suma);

        scanner.close();
    }
}