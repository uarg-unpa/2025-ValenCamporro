package tp2_1.Punto5;

public class HoraMain {
    public static void main(String[] args) {

        Hora hora1 = new Hora(10, 30, 45); // Válido
        System.out.println("- Hora 1 -");
        System.out.println(hora1);
        System.out.println("Hora 1 en minutos: " + hora1.devolverMin());
        System.out.println();

        Hora hora2 = new Hora(25, 61, 70); // Inválido
        System.out.println("- Hora 2 -");
        System.out.println(hora2);
        System.out.println("Hora 2 en minutos: " + hora2.devolverMin());
    }
}
