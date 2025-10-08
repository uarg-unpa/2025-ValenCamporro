package tp2_2.Punto4;

/* Un artículo tiene una descripción, un precio, un código, y un stock (cantidad de unidades disponibles del
artículo). Implementar las operaciones que permitan decrementar e incrementar el stock. */

public class Articulo {
    
    private String descripcion;
    private int precio;
    private String codigo;
    private int stock;

    public Articulo(String descripcion, int precio, String codigo, int stock) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.codigo = codigo;
        this.stock = stock;
    }

    public void setDescrpcion(String d) {
        this.descripcion = d;
    }
    public String getDescrpcion() {
        return this.descripcion;
    }

    public void setPrecio(int p) {
        this.precio = p;
    }
    public int getPrecio() {
        return this.precio;
    }

    public void setCodigo(String c) {
        this.codigo = c;
    }
    public String getCodigo() {
        return this.codigo;
    }

    public void setStock(int s) {
        this.stock = s;
    }
    public int getStock() {
        return this.stock;
    }

    public void incrementarStock(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
        }
    }

    public void decrementarStock(int cantidad) {
        if (cantidad > 0) {
            if (cantidad <= stock) {
                stock -= cantidad;
            } else {
                System.out.println("No hay suficiente stock");
            }
        }
    }

    public String toString() {
        return "| " + descripcion + " | " + "Código: " + codigo + " - Precio: $" + precio + " - Stock: " + stock;
    }
}