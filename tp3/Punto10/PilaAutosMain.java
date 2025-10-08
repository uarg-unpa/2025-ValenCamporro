package Punto10;

public class PilaAutosMain {
    public static void main(String[] args) {
        
        PilaAutos pila = new PilaAutos();
        
        pila.apilar(new Auto("AB123CD", "Ford", "Fiesta"));
        pila.apilar(new Auto("EF456GH", "Jeep", "Wrangler Rubicon"));
        pila.apilar(new Auto("IJ789KL", "Toyota", "Corolla"));
        
        String patenteBuscada = "EF456GH";
        Auto encontrado = pila.patente(patenteBuscada);
        
        if (encontrado != null) {
            System.out.println("- Auto encontrado y eliminado -");
            System.out.println(encontrado);
        } else {
            System.out.println("No se encontró un auto con la patente " + patenteBuscada);
        }
    }
}