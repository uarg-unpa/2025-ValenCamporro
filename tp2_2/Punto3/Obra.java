package tp2_2.Punto3;

/* Un teatro se caracteriza por su nombre y su dirección y en él se realizan 3 obras teatrales al día. Cada obra
tiene un nombre y un precio. Realice el diseño de clases e indique qué métodos tendría cada clase, teniendo en
cuenta que se pueda cambiar el nombre del teatro y el nombre y precio de las obras. */

public class Obra {
    
    private String nombre;
    private int precio;

    public Obra(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setPrecio(int p) {
        this.precio = p;
    }
    public int getPrecio() {
        return this.precio;
    }

    public String toString() {
        return "Obra: " + nombre + " - Precio: " + precio + "$";
    }
}