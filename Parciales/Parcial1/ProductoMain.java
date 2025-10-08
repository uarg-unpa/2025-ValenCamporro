package Parciales.Parcial1;
import java.util.Scanner;
public class ProductoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Producto 1
        System.out.print("- Producto 1 -");
        System.out.println();
        System.out.println("Ingrese el nombre del primer producto: ");
        String nombre = scanner.next();
        scanner.nextLine();

        System.out.println("Ingrese el precio del primer producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese la cantidad en stock del primer producto: ");
        int cantidadStock = scanner.nextInt();
        scanner.nextLine();

        Producto p1 = new Producto(nombre, precio, cantidadStock);

        System.out.println();
        System.out.println("Desea vender el producto? (si/no)");
        String respuesta1 = scanner.next().toLowerCase();
        if (respuesta1.equals("si" )) { 
            System.out.println("Ingrese la cantidad a vender: ");
            int cantidadAVender = scanner.nextInt();
            p1.vender(cantidadAVender);
            cantidadAVender = p1.cantidadStock();
        } else {
            System.out.println("No se ha vendido el producto.");
        }
    
        System.out.println();
        System.out.println(p1);

        //producto 2
        System.out.println();
        System.out.print("- Producto 2 -");
        System.out.println();
        System.out.println("Ingrese el nombre del segundo producto: ");
        String nombre2 = scanner.next();
        scanner.nextLine();

        System.out.println("Ingrese el precio del segundo producto: ");
        double precio2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese la cantidad en stock del segundo producto: ");
        int cantidadStock2 = scanner.nextInt();
        scanner.nextLine();

        Producto p2 = new Producto(nombre2, precio2, cantidadStock2);

        System.out.println();
        System.out.println("Desea aumentar el stock del producto? (si/no)");
        String respuesta2 = scanner.next().toLowerCase();
        if (respuesta2.equals ("si")) {
            System.out.println("Ingrese la cantidad a aumentar: ");
            int cantidadAumentar = scanner.nextInt();
            p2.aumentarStock(cantidadAumentar);
        } else {
            System.out.println("No se ha aumentado el stock del producto.");
        }

        System.out.println();
        System.out.println(p2);
        System.out.println();

        System.out.println("El producto con más stock es: ");
        if (p1.tieneMasStockQue(p2)) {
            System.out.println(p1.getNombre());
        } else {
            if (p2.tieneMasStockQue(p1)) {
                System.out.println(p2.getNombre());
            } else {
                System.out.println("Ambos productos tienen la misma cantidad en stock.");
            }
        }

        scanner.close();    
    }
}
