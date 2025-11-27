package tp2_2.Punto4;

public class ArticuloMain {
    public static void main(String[] args) {
        
        Articulo articulo = new Articulo("PlayStation 5", 1149999, "ps50001", 20);

        System.out.println(articulo);
        System.out.println();

        articulo.incrementarStock(5);
        System.out.println("Se ha repuesto el artículo. Actualización:");
        System.out.println(articulo);
        System.out.println();

        articulo.decrementarStock(13);
        System.out.println("Se ha vendido el artículo. Actualización: ");
        System.out.println(articulo);
        System.out.println();

        articulo.decrementarStock(13);
    }
}