package Actividad_Aulica.PrimerActividad;

public class Planta {

    private String nombre;
    private String tipo;
    private int nivelAgua;
    private double altura; 

    public Planta (String nombre, String tipo, int nivelAgua, double altura) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivelAgua = nivelAgua;
        this.altura = altura;
    }

    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
     public int getNivelAgua(){
        return nivelAgua;
    }
    public double getAltura(){
        return altura;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setNivelAgua(int nivelAgua ){
        this.nivelAgua = nivelAgua;
    }
    public void setAltura (double altura){
        this.altura = altura;
    }

    public String verificarRiego() {
        if (nivelAgua < 30) {
            return "La planta necesita ser regada";
        } else {
            return "La planta no necesita ser regada";
        }
    }

    public void crecer() {
        this.altura += 1.0;
    }

    public void regar() {
        this.nivelAgua += 10;
        if (this.nivelAgua > 100) {
            this.nivelAgua = 100;
        }
        this.crecer();
    }

    public String toString() {
        return "Planta: " + nombre + " - Tipo de planta: " + tipo + " - Altura: " + altura + " cm - Agua: " + nivelAgua + "% - Estado: " + verificarRiego();
    }
}