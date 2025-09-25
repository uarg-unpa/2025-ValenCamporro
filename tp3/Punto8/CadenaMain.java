package Punto8;

public class CadenaMain {
    public static void main(String[] args) {

        Cadena c1 = new Cadena("ABLE WAS I ERE I SAW ELBA"); //es válido
        System.out.println("La oración " + c1.getOracion() + " " + c1.esPalindromo());
        System.out.println();
        
        Cadena c2 = new Cadena("LA RUTA NATURAL"); //no es válido
        System.out.println("La oración " + c2.getOracion() + " " + c2.esPalindromo());
    }
}