package tp1;
import java.util.Scanner;

/* Ingresar un día de la semana y si se trata de uno de los días de la cátedra resolución escribir “HOY TENGO
RESOLUCION”. Identificando a los días de la siguiente manera: ‘L’ para Lunes, ‘M’ para Martes, ‘I’ para
Miércoles, ‘J’ para Jueves, ‘V’ para Viernes, ‘S’ para Sábado y ‘D’ para Domingo. Se puede agregar el caso
dónde la letra ingresada no sea alguna de las nombradas anteriormente. */

public class Punto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un día de la semana (L, M, I, J, V, S, D)");
        char dia = scanner.next().charAt(0);
        scanner.nextLine();

        if (dia == 'M' || dia == 'I' || dia == 'J') {
            System.out.println("HOY TENGO RESOLUCION");
        } else {
            if (dia == 'L' || dia == 'V' || dia == 'S' || dia == 'D') {
                System.out.println("HOY NO TENGO RESOLUCION");
            } else {
                System.out.println("Día invalido. Intentar de nuevo.");
            }
        }
        scanner.close();
    }
}
