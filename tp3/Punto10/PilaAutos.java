package Punto10;

public class PilaAutos {
    
    private Auto[] pila;
    private int cima;

    public PilaAutos() {
        pila = new Auto[10];
        cima = -1;
    }

    public Auto[] getPila() {
        return pila;
    }
    public void setPila(Auto[] pila) {
        this.pila = pila;
    }

    public int getCima() {
        return cima;
    }
    public void setCima(int cima) {
        this.cima = cima;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == pila.length - 1;
    }

    public void apilar(Auto a) {
        if (!estaLlena()) {
            cima++;
            pila[cima] = a;
        } else {
            System.out.println("La pila está llena. No se puede agregar más autos.");
        }
    }

    public Auto desapilar() {
        if (!estaVacia()) {
            Auto aux = pila[cima];
            cima--;
            return aux;
        } else {
            System.out.println("La pila está vacía.");
            return null;
        }
    }

    public Auto patente(String patente) {
        PilaAutos aux = new PilaAutos();
        Auto encontrado = null;
        while (!estaVacia()) {
            Auto a = desapilar();
            if (a.getPatente().equalsIgnoreCase(patente)) {
                encontrado = a;
                break;
            } else {
                aux.apilar(a);
            }
        }
        // Volver a pasar los autos
        while (!aux.estaVacia()) {
            apilar(aux.desapilar());
        }
        return encontrado;
    }
}