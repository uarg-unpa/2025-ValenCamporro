package tp2_1.Punto7;
import tp2_1.Punto6.Fecha;

/* Escribir un programa en el que se creen dos objetos de tipo Fecha. Probar los métodos creados
anteriormente. Mostrar en formato (dd/mm/aaaa) aquella fecha, de ambas, que sea de mayor año. */

public class FechaMain {
    public static void main(String[] args) {
        
        Fecha f1 = new Fecha(9, 6, 2005); // Válido
        System.out.println("- Fecha 1 -");
        System.out.println(f1);
        System.out.println();

        Fecha f2 = new Fecha(29, 2, 2025); // Inválido
        System.out.println("- Fecha 2 -");
        System.out.println(f2);
        System.out.println();

        if (f1.getAnio() > f2.getAnio()) {
            System.out.println("La fecha con mayor año es: " + f1.getDia() + "/" + f1.getMes() + "/" + f1.getAnio());
        } else {
            if (f2.getAnio() > f1.getAnio()) {
                System.out.println("La fecha con mayor año es: " + f2.getDia() + "/" + f2.getMes() + "/" + f2.getAnio());
            } else {
                System.out.println("Las dos fechas tienen el mismo año: " + f1.getAnio());
            }
        }
    }
}
