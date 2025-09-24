package tp2_2.Punto6;

/* Implementar una clase que contenga un arreglo como atributo y permita mediante operaciones ingresar
números y guardarlos en el arreglo, mostrar los números ingresados y vaciar el arreglo. */

public class Arreglo {
    
    private int[] numeros;
    private int contador;

    public Arreglo(int tamaño) {
        numeros = new int[tamaño];
        contador = 0;
    }

    public void ingresarNum(int numero) {
        if (contador < numeros.length) {
            numeros[contador] = numero;
            contador++;
        } else {
            System.out.println("El arreglo ya está lleno, no se pueden agregar más.");
        }
    }

    public void mostrarNum() {
        if (contador == 0) {
            System.out.println("El arreglo está vacío.");
        } else {
            System.out.print("Números en el arreglo: ");
            for (int i = 0; i < contador; i++) {
                System.out.print(numeros[i]);
            }
            System.out.println();
        }
    }

    public void vaciarArreglo() {
        contador = 0;
        System.out.println("El arreglo se vació.");
    }
}