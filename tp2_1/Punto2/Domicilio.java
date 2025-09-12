package tp2_1.Punto2;

/* Implemente en código JAVA, 4 clases de las definidas en el punto 1. (DOMICILIO) */

public class Domicilio {

    private String calle;
    private int numero;
    private String ciudad;
    private String provincia;
    private String pais;

    public Domicilio(String calle, int numero, String ciudad, String provincia, String pais) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
    }

    public void setCalle(String ca) {
        this.calle = ca;
    }
    public String getCalle() {
        return this.calle;
    }

    public void setNumero(int n) {
        this.numero = n;
    }
    public int getNumero() {
        return this.numero;
    }

    public void setCiudad(String ci) {
        this.ciudad = ci;
    }
    public String getCiudad() {
        return this.ciudad;
    }

    public void setProvincia(String p) {
        this.provincia = p;
    }
    public String getProvincia() {
        return this.provincia;
    }

    public void setPais(String p) {
        this.pais = p;
    }
    public String getPais() {
        return this.pais;
    }

    public String toString() {
        return calle + " " + numero + ", " + provincia + ", " + pais;
    }
}