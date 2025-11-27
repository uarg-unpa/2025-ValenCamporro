package Parciales.Parcial1;
public class Producto {
    
    //Atributos
    private String nombre;
    private double precio;
    private int cantidadStock;

    //Constructor
    public Producto (String n, double p,  int c) {
        nombre = n;
        precio = p;
        cantidadStock = c;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String n) {
        nombre = n;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double p) {
        precio = p;
    }

    public int cantidadStock() {
        return cantidadStock;
    }
    public void setCantidadStock(int c) {
        cantidadStock = c;
    }

    //Métodos
    public boolean hayStock(int cantidad) {
        if (this.cantidadStock > 0 && cantidad <= this.cantidadStock) {
            return true;
        } else {
            return false;
        }
    }

    public void vender(int cantidad) {
        if (this.cantidadStock > 0 && cantidad <= this.cantidadStock) {
            this.cantidadStock -= cantidad;
            System.out.println("Se vendió la cantidad.");
        } else {
            System.out.println("No se pudo vender por falta de stock.");
        }
    }

    public void aumentarStock(int cantidad) {
        if (cantidad > 0) {
            cantidadStock += cantidad;
        }
    }

    public boolean tieneMasStockQue(Producto p) {
        return this.cantidadStock > p.cantidadStock;
    }

    public String toString() {
        return "Nombre: " + this.nombre + ", Precio: " + this.precio + ", Cantidad en stock: " + this.cantidadStock;
    }
}