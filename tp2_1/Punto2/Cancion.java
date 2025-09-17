package tp2_1.Punto2;

/* Implemente en código JAVA, 4 clases de las definidas en el punto 1. (CANCIÓN) */

public class Cancion{

    private String titulo;
    private String artista;
    private String genero;
    private int duracion;

    public Cancion(String titulo, String artista, String genero, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }
    public String getTitulo() {
        return this.titulo;
    }

    public void setArtista(String a) {
        this.artista = a;
    }
    public String getArtista() {
        return this.artista;
    }

    public void setGenero(String g) {
        this.genero = g;
    }
    public String getGenero() {
        return this.genero;
    }

    public void setDuracion(int d) {
        this.duracion = d;
    }
    public int getDuracion() {
        return this.duracion;
    }

    public void reproducir() {
        System.out.println("Reproduciendo " + titulo + " de " + artista);
    }

    public void pausar() {
        System.out.println("Pausando " + titulo + " de " + artista);
    }

    public String toString() {
        return titulo + " de " + artista + " (" + genero + ", " + duracion + " segundos)";
    }
}