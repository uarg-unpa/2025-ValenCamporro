package Actividad_Aulica;

public class Jardineria {
    public static void main (String [] args) {

        Planta p1 = new Planta("Aloe Vera", "interior", 70, 15.5);
        Planta p2 = new Planta("Helecho", "exterior", 22, 23.1);

        p1.crecer(2.0);
        System.out.println(p1);

        System.out.println(p2);
    }
}