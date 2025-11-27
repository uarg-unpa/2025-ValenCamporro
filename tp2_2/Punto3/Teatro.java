package tp2_2.Punto3;

/* Un teatro se caracteriza por su nombre y su dirección y en él se realizan 3 obras teatrales al día. Cada obra
tiene un nombre y un precio. Realice el diseño de clases e indique qué métodos tendría cada clase, teniendo en
cuenta que se pueda cambiar el nombre del teatro y el nombre y precio de las obras. */

public class Teatro {
    
    private String nombre;
    private String direccion;
    private Obra obra1;
    private Obra obra2;
    private Obra obra3;

    public Teatro(String nombre, String direccion, Obra obra1, Obra obra2, Obra obra3) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.obra1 = obra1;
        this.obra2 = obra2;
        this.obra3 = obra3;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setDireccion(String d) {
        this.direccion = d;
    }
    public String getDireccion() {
        return this.direccion;
    }

    public void setObra1(String nombre, int precio) {
        obra1.setNombre(nombre);
        obra1.setPrecio(precio);
    }

    public void setObra2(String nombre, int precio) {
        obra1.setNombre(nombre);
        obra1.setPrecio(precio);
    }

    public void setObra3(String nombre, int precio) {
        obra1.setNombre(nombre);
        obra1.setPrecio(precio);
    }

    public String toString() {
        return "Teatro: " + nombre + " - Dirección: " + direccion + "\nObra 1: " + obra1 + "\nObra 2: " + obra2 + "\nObra 3: " + obra3; // "\n" lo coloca abajo
    }
}