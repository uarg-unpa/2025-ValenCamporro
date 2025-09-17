package tp2_1.Punto2;

public class CancionMain {
    public static void main(String[] args) {
        Cancion cancion = new Cancion("Imagine", "John Lennon", "Rock", 183);

        System.out.println("Detalles de la canción:");
        System.out.println(cancion);

        cancion.reproducir();
        cancion.pausar();
    }
}
