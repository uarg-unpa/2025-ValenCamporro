package tp4.Punto3y4y5y6;

public class MainCola {
    public static void main(String[] args) {

        Cola cola1 = new Cola();
        Cola cola2 = new Cola();

        // 3.
        System.out.println("Punto 3: Encolar elementos.");
        cola1.encolar(5);
        cola1.encolar(3);
        cola1.encolar(8);
        cola1.encolar(3);
        cola1.encolar(1);
        System.out.println("- Cola 1 -");
        System.out.println(cola1);

        // Intentar encolar demás
        boolean pudoEncolar = cola1.encolar(10);
        if (!pudoEncolar) {
            System.out.println("La cola está llena, no se pudo encolar.");
        }

        // Desencolar un elemento
        int desencolado = cola1.desencolar();
        if (desencolado == -1) {
            System.out.println("La cola está vacía, no se pudo desencolar.");
        } else {
            System.out.println("El elemento '" + desencolado + "' fue desencolado.");
        }

        System.out.println("- Cola 1 desencolada -");
        System.out.println(cola1);

        // 4.
        System.out.println();
        System.out.println("Punto 4: Contar.");
        System.out.println("Cantidad de elementos en la cola: " + cola1.contar());

        // 5.
        System.out.println();
        System.out.println("Punto 5: Eliminar repetidos.");
        boolean rep = cola1.eliminarRepetidos();
        if (rep) {
            System.out.println("Se eliminaron elementos repetidos.");
        } else {
            System.out.println("No había elementos repetidos, o la cola estaba vacía.");
        }

        System.out.println("- Cola 1 sin repetidos -");
        System.out.println(cola1);

        // 6.
        System.out.println();
        System.out.println("Punto 6: Comparar colas.");
        cola2.encolar(5);
        cola2.encolar(8);
        cola2.encolar(1);

        System.out.println("- Cola 2 -");
        System.out.println(cola2);

        boolean sonIguales = cola1.sonIdenticas(cola2);
        if (sonIguales) {
            System.out.println("Las colas son idénticas.");
        } else {
            System.out.println("Las colas no son idénticas.");
        }
    }
}