package tp2_2.Punto2;

/* Implemente la clase. */

public class EstacionDeServicioMain {
    public static void main(String[] args) {
        
        EstacionDeServicio estacion1 = new EstacionDeServicio(5); //Poco combustible
        System.out.println("- Estacion de Servicio 1 -");
        estacion1.reponer(4);
        System.out.println(estacion1);
        System.out.println();

        EstacionDeServicio estacion2 = new EstacionDeServicio(10000); //Capacidad Máxima
        System.out.println("- Estacion de Servicio 2 -");
        estacion2.reponer(100);
        System.out.println(estacion2);
        System.out.println();
    }
}