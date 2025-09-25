package tp2_2.Punto6;

public class ArregloMain {
    public static void main(String[] args) {
        
        Arreglo ar = new Arreglo(5);

        ar.ingresarNum(1);
        ar.ingresarNum(2);
        ar.ingresarNum(3);
        ar.ingresarNum(4);
        ar.ingresarNum(5);
        /*si se agrega uno más se llena.
        ar.ingresarNum(6); */

        ar.mostrarNum();

        ar.vaciarArreglo();

        ar.mostrarNum();
    }
}