package tp1;
import java.util.Scanner;

/* Dado tres números, escribir el mayor de ellos. Asumir que los tres números son distintos. */

public class Punto4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese tres numeros enteros.");
        System.out.println("Numero 1: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Numero 2: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Numero 3: ");
        int num3 = scanner.nextInt();
        scanner.nextLine();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es: " + num1);
        } else {
            if (num2 > num1 && num2 > num3) {
                System.out.println("El mayor es: " + num2);
            } else {
                System.out.println("El mayor es: " + num3);
            }
        } 
  scanner.close();
    }
}