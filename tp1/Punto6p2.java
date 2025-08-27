package tp1;
import java.util.Scanner;

/* Repita la operación anterior, pero esta vez, para los tres valores utilizar
una sola variable (NUM). */

public class Punto6p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int producto = 1;
        int suma = 0;
        int cont = 1;

        System.out.println("Ingrese tres números enteros: ");
        while (cont <= 3){
            System.out.println("Número " + cont + ":");
            int num = scanner.nextInt();
            scanner.nextLine();
            suma = suma + num;
            producto = producto * num;
            cont = cont + 1;
        }

        System.out.println("el producto de los enteros es: " + producto);
        System.out.println("La suma de los enteros es: " + suma);

        scanner.close();
    }
}
