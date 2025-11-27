package tp4.Punto3y4y5y6;

/* 3. Escriba la clase Cola cuya declaración de atributos y métodos correspondan a la implementación
Frente Fijo y Final Movible (tener en cuenta que al borrar debe correr todos los elementos). 

4. En base a la implementación Frente y Final movible, escribir un método contar que devuelva la
cantidad de elementos en la cola. Nota: no olvidar que, si bien la cola se implementa como un arreglo,
no debería manejarse como tal.

5. Agregar un método en la clase Cola que elimine los elementos repetidos de la cola.

6. Escribir un método en la clase cola que tenga como argumento una cola del mismo tipo y
devuelva verdadero o falso si las dos colas son o no idénticas (tienen el mismo tamaño y poseen los
mismos elementos), respectivamente. Nota: no olvidar que, si bien la cola se implementa como un
arreglo, no debería manejarse como tal. */

public class Cola {
    
    private final int maxcola = 5;
    private int frente, ultimo;
    private int[] elementos;
    private int cantidad;

    public Cola() {
        elementos = new int[maxcola];
        frente = 0;
        ultimo = -1;
        cantidad = 0;

    }

    // Getters y setters
    public int getFrente() {
        return frente;
    }
    public void setFrente(int frente) {
        this.frente = frente;
    }

    public int getUltimo() {
        return ultimo;
    }
    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }

    public int[] getElementos() {
        return elementos;
    }
    public void setElementos(int[] elementos) {
        this.elementos = elementos;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Métodos
    // 3.
    public boolean estaVacia() {
        return cantidad == 0;
    }

    public boolean estaLlena() {
        return cantidad == maxcola;
    }

    public boolean encolar(int elemento) {
        if (estaLlena()) {
            return false; // NOTA PARA PARCIAL: como dijo el profe, no imprimir (SOP)! 
        } else {
            ultimo = (ultimo + 1) % maxcola;
            elementos[ultimo] = elemento;
            cantidad++;
            return true;
        }
    }

    public int desencolar() {
        if (estaVacia()) {
            return -1;
        } else {
            int elemento = elementos[frente];
            frente = (frente + 1) % maxcola;
            cantidad--;
            return elemento;
        }
    }
        
    // 4.
    public int contar() {
        if (estaVacia()) {
            return 0;
        } else {
            return cantidad;
        }
    }

    // 5.
    public boolean eliminarRepetidos() {
        if (estaVacia()) {
            return false;
        } else {
            Cola auxiliar = new Cola();
            boolean huboRepetidos = false;  
            for (int i = 0; i < cantidad; i++) {
                int indice = (frente + i) % maxcola;
                int actual = elementos[indice]; //q sopa
                if (!contiene(auxiliar, actual)) {
                    auxiliar.encolar(actual);
                } else {
                    huboRepetidos = true;
                }
            }
            //se copia la cola auxiliar a la cola actual
            for (int i = 0; i < maxcola; i++) {
                this.elementos[i] = auxiliar.elementos[i];
            }
            this.frente = auxiliar.frente;
            this.ultimo = auxiliar.ultimo;
            this.cantidad = auxiliar.cantidad;
            return huboRepetidos;
        }
    }
    //método auxiliar del 5.
    private boolean contiene(Cola cola, int valor) {
        if (cola.estaVacia()) {
            return false;
        } else {
            for (int i = 0; i < cola.cantidad; i++) {
                int indice = (cola.frente + i) % cola.maxcola;
                if (cola.elementos[indice] == valor) {
                    return true;
                }
            }
            return false;
        }
    }

    // 6.
    public boolean sonIdenticas(Cola otra) {
        if (this.cantidad != otra.cantidad) {
            return false;
        } else {
            for (int i = 0; i < this.cantidad; i++) {
                int indice1 = (this.frente + i) % this.maxcola;
                int indice2 = (otra.frente + i) % otra.maxcola;
                //a
                if (this.elementos[indice1] != otra.elementos[indice2]) {
                    return false;
                }
            }
            return true;
        }   
    }

    // Mostrar la cola (tengo entendido que acá tampoco se debe poner sop)
    public String toString() {
        if (estaVacia()) {
            return "La cola está vacía.";
        } else {
            String texto = "Cola: ";
            for (int i = 0; i < cantidad; i++) {
                int indice = (frente + i) % maxcola;
                texto += elementos[indice] + " ";
            }
            return texto;
        }
    }
}