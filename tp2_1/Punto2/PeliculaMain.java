package tp2_1.Punto2;

public class PeliculaMain {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("El Padrino", "Francis Ford Coppola", 175, "Crimen", 1972);

        System.out.println("Detalles de la película:");
        System.out.println(pelicula);

        pelicula.reproducir();
    }
}
