package Actividad_Aulica;
import java.util.Scanner;

public class Jardineria {

    public static Planta crearPlanta(Scanner scanner, String mensaje) {
        System.out.println(mensaje);

        System.out.println("Ingrese el nombre para la planta: ");
        String nombre = scanner.next();
        scanner.nextLine();
        System.out.println("Ingrese el nivel del agua (del 1 al 100): ");
        int nivelAgua = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la altura de la planta: ");
        double altura = scanner.nextDouble();
        scanner.nextLine();
         
        String tipo;
        while (true) {
            System.out.println("Ingrese el tipo de planta (interior o exterior): ");
            tipo = scanner.nextLine().toLowerCase();
            if (tipo.equals("interior") || tipo.equals("exterior")) {
                break;
            } else {
                System.out.println("Tipo inválido. Intentelo nuevamente: ");
            }
        }

        Planta planta = new Planta(nombre, tipo, nivelAgua, altura);

        System.out.println("Desea regar la planta? (si/no): ");
        String respuesta = scanner.nextLine().toLowerCase();
        if (respuesta.equals("si")) {
            planta.regar();
            System.out.println("La planta ha sido regada un 10% y ha crecido 1 cm.");
        } else {
            System.out.println("La planta no ha sido regada.");
        }

        System.out.println();
        return planta;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Planta p1 = crearPlanta(scanner, "- Primera planta -");
        System.out.println(p1);
        System.out.println();

        Planta p2 = crearPlanta(scanner, "- Segunda planta -");
        System.out.println(p2);

        scanner.close();
    }
}