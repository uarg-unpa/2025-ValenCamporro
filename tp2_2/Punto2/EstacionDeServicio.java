package tp2_2.Punto2;

/* Una estación de servicio cuenta con una capacidad máxima de 10000 litros. En la estación es posible cargar
o reponer combustible. Cuando la capacidad de la estación está por debajo de los 10 litros se debe informar de
tal situación. */

public class EstacionDeServicio {

    private int capacidad;
    private int capacidadMax;

    public EstacionDeServicio(int litrosInicio) {
        this.capacidadMax = 10000;
        if (litrosInicio <= capacidadMax) {
            this.capacidad = litrosInicio;
        } else {
            this.capacidad = capacidadMax;
        }
    }
    
    public void setCapacidad(int c) {
        this.capacidad = c;
    }
    public int getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidadMax(int cm) {
        this.capacidadMax = cm;
    }
    public int getCapacidadMax() {
        return this.capacidadMax;
    }

    public void reponer(int litros) {
        if (litros > 0) {
            capacidad += litros;
            if (capacidad > capacidadMax) {
                capacidad = capacidadMax;
            }
        }
        if (capacidad < 10) {
            System.out.println("El combustible está por debajo de los 10 litros.");
        }
    }

    public String toString() {
        return "Capacidad actual: " + capacidad + " - litros máximos: " + capacidadMax;
    }
}
