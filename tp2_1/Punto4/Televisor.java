package tp2_1.Punto4;

/* En base a las propiedades obtenidas en el ejercicio 2, implementar la clase Televisor. Con el constructor,
los set y get que sean necesarios, y con los métodos para encender, apagar, subir y bajar el canal, subir y bajar
el volumen, y volver al canal antes seleccionado. */

public class Televisor {

    //Atributos
    private boolean estado;
    private int canalActual;
    private int volumenActual;
    private int canalAnterior;

    //Constructor
    public Televisor(boolean estado, int canalActual, int volumenActual, int canalAnterior) {
        this.estado = estado;
        this.canalActual = canalActual;
        this.volumenActual = volumenActual;
        this.canalAnterior = canalAnterior;
    }

    //Getters y setters
    public void setEstado(boolean e) {
        this.estado = e;
    }
    public boolean getEstado() {
        return this.estado;
    }

    public void setCanalActual(int c) {
        this.canalActual = c;
    }
    public int getCanalActual() {
        return this.canalActual;
    }

    public void setVolumenActual(int v) {
        this.volumenActual = v;
    }
    public int getVolumenActual() {
        return this.volumenActual;
    }
    public void setCanalAnterior(int c) {
        this.canalAnterior = c;
    }
    public int getCanalAnterior() {
        return this.canalAnterior;
    }

    //Métodos
    public boolean isEncendido() {
        return estado;
    }

    public void encender() {
        if (!estado) {
            estado = true;
            System.out.println("Televisor encendido.");
        } else {
            System.out.println("El televisor ya está encendido.");
        }
    }

    public void apagar() {
        if (estado) {
            estado = false;
            System.out.println("Televisor apagado.");
        } else {
            System.out.println("El televisor ya está apagado.");
        }
    }

    public void subirCanal() {
        if (estado) {
            canalAnterior = canalActual;
            canalActual++;
            System.out.println("Canal subido a: " + canalActual);
        } else {
            System.out.println("El televisor está apagado.");
        }
    }

    public void bajarCanal() {
        if (estado) {
            if (canalActual > 1) {
                canalAnterior = canalActual;
                canalActual--;
                System.out.println("Canal bajado a: " + canalActual);
            } else {
                System.out.println("Ya estás en el canal más bajo.");
            }
        } else {
            System.out.println("El televisor está apagado.");
        }
    }

    public void volverCanalAnterior() {
        if (estado) {
            int aux = canalActual;
            canalActual = canalAnterior;
            canalAnterior = aux;
            System.out.println("Volviendo al canal anterior: " + canalActual);
        } else {
            System.out.println("El televisor está apagado.");
        }
    }

    public void subirVolumen() {
        if (estado) {
            if (volumenActual < 100) {
                volumenActual++;
                System.out.println("Volumen subido a: " + volumenActual);
            } else {
                System.out.println("El volumen ya está al máximo.");
            }
        } else {
            System.out.println("El televisor está apagado.");
        }
    }

    public void bajarVolumen() {
        if (estado) {
            if (volumenActual > 0) {
                volumenActual--;
                System.out.println("Volumen bajado a: " + volumenActual);
            } else {
                System.out.println("El volumen ya está al mínimo.");
            }
        } else {
            System.out.println("El televisor está apagado.");
        }
    }
}