package tp4.Punto9;

/* 9. Un estacionamiento de autos contiene una sola línea, la cual tiene capacidad para 10 autos. Los
autos llegan al extremo sur y salen por el norte, si un cliente llega a retirar su auto que no está muy
hacia el norte, todos los autos al norte de su auto son retirados, el auto del cliente sale, y los otros
autos son colocados de nuevo en el mismo orden en el que estaban originalmente. Cada vez que sale
un auto, todos los autos que están al sur son movidos hacia adelante de tal manera que en todo
momento todos los espacios vacíos están en la parte sur del estacionamiento. */

public class Estacionamiento {

    private ColaEstacionamiento cola;

    public Estacionamiento() {
        cola = new ColaEstacionamiento(10);
    }

    //métodos
    public boolean llegada(String patente) {
        return cola.encolar(patente);
    }

    public int salida (String patente) {
        ColaEstacionamiento movidos = new ColaEstacionamiento(10);
        ColaEstacionamiento temporales = new ColaEstacionamiento(10);
        int movimientos = 0;
        boolean encontrado = false;

        //se sacan autos hasta que se encuentra el buscado
        while (!cola.estaVacia()) {
            String actual = cola.desencolar();
            if (actual.equals(patente)) {
                encontrado = true;
                break;
            } else {
                temporales.encolar(actual);
                movimientos++;
            }
        }

        if (!encontrado) {
            while (!temporales.estaVacia()) {
                cola.encolar(temporales.desencolar());
            }
            return -1; // no se encontro ekl auto
        }

        //saca los autos del norte
        while (!cola.estaVacia()) {
            movidos.encolar(cola.desencolar());
            movimientos++;
        }

        //los vuelve a poner
        while (!movidos.estaVacia()) {
            cola.encolar(movidos.desencolar());
        }

        // vuelve a poner los del sur
        while (!temporales.estaVacia()) {
            cola.encolar(temporales.desencolar());
        }

        return movimientos;
    }
}