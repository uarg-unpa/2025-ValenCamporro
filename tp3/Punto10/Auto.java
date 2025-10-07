package Punto10;

/* 10. Implementar una pila de autos, la cual puede guardar hasta 10 autos. En un main permitir al usuario
ingresar autos y buscar un auto por número de patente y si se encuentra en la pila sacarlo y mostrar la
información del mismo */

public class Auto {
    
    private String patente;
    private String marca;
    private String modelo;

    public Auto(String patente, String marca, String modelo) {
        this.patente = patente;
        this. marca = marca;
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String toString() {
        return "Patente: " + patente + " - Marca: " + marca + " - Modelo: " + modelo;
    }
}