package tp4.Punto9;

/* 9. Un estacionamiento de autos contiene una sola línea, la cual tiene capacidad para 10 autos. Los
autos llegan al extremo sur y salen por el norte, si un cliente llega a retirar su auto que no está muy
hacia el norte, todos los autos al norte de su auto son retirados, el auto del cliente sale, y los otros
autos son colocados de nuevo en el mismo orden en el que estaban originalmente. Cada vez que sale
un auto, todos los autos que están al sur son movidos hacia adelante de tal manera que en todo
momento todos los espacios vacíos están en la parte sur del estacionamiento. */

public class ColaEstacionamiento {

    private String[] datos;
    private int ultimo;
    private final int MAX;

    public ColaEstacionamiento(int capacidad) {
        MAX = capacidad;
        datos = new String[MAX];
        ultimo = -1;
    }

    //getters y setters

    public String[] getDatos() {
        return datos;
    }
    public void setDatos(String[] datos) {
        this.datos = datos;
    }

    public int getUltimo() {
        return ultimo;
    }
    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }

    //métodos
    public boolean estaVacia() {
        return ultimo == -1;
    }

    public boolean estaLlena() {
        return ultimo == MAX - 1;
    }

    public boolean encolar(String patente) {
        if (estaLlena()) {
            return false;
        } else {
            ultimo++;
            datos[ultimo] = patente;
            return true;
        }
    }

    public String desencolar() {
        if (estaVacia()) {
            return null;
        } else {
            String salida = datos[0];
            for (int i = 0; i < ultimo; i++) {
                datos[i] = datos[i + 1];
            }
            ultimo--;
            return salida;
        }
    }
}