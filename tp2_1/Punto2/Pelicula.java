package tp2_1.Punto2;

/* Implemente en código JAVA, 4 clases de las definidas en el punto 1. (PELICULA) */

public class Pelicula {

    private String titulo;
    private String director;
    private int duracion;
    private String genero;
    private int año;

    public Pelicula(String titulo, String director, int duracion, String genero, int año) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.año = año;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }
    public String getTitulo() {
        return this.titulo;
    }

    public void setDirector(String d) {
        this.director = d;
    }
    public String getDirector() {
        return this.director;
    }

    public void setDuracion(int d) {
        this.duracion = d;
    }
    public int getDuracion() {
        return this.duracion;
    }

    public void setGenero(String g) {
        this.genero = g;
    }
    public String getGenero() {
        return this.genero;
    }

    public void setAño(int a) {
        this.año = a;
    }
    public int getAño() {
        return this.año;
    }

    public void reproducir() {
        System.out.println("Reproduciendo película: " + titulo);
    }

    public String toString() {
        return titulo + " (" + año + ") Dirigida por " + director + " - " + genero  + " - " + duracion;
    }
}