package Actividad_Aulica.SegundaActividad;

/* 1. Ejercicio 1: Cola con Frente Fijo y Final Movible (Gestión de Caracteres)

   Crea una clase ColaCaracteres que implemente una cola con frente fijo en el índice 0 y final movible, incluyendo desplazamiento al desencolar (como vimos en clase).
   Diseña un programa MainColaCaracteres que simule una cola de caracteres representando una lista de comandos de teclado (ej: 'a', 'b', 'c'). El programa debe permitir:

   - Encolar un nuevo comando ingresado por el usuario (usando char).
   - Desencolar el comando más antiguo: Esto significa eliminar y retornar el comando que fue encolado primero en la cola (el que está en el frente, posición 0),
   desplazando los elementos restantes hacia la izquierda para mantener la cola ordenada y compacta, respetando el principio FIFO (First In, First Out).
   - Mostrar el comando en el frente sin desencolarlo (usando peek).
   - Mostrar el estado de la cola (vacía, llena ).

   Prueba la cola encolando 5 comandos, desencolando 2 y volviendo a encolar hasta llenarla (máximo 10 comandos).

   Recordatorio: Revisaron con la profesora el método peek y deben mejorarlo. En lugar de acceder directamente al array con elementos[frente],
   implementen peek como un método que simule el manejo de la cola, verificando el estado (aunque las validaciones queden en el main) y retornando el valor del frente de forma segura,
   alineado con el comportamiento FIFO. */

public class ColaCaracteres {
    
    private final int maxCola = 10;
    private int frente;
    private int fin;
    private char[] elementos;

    public ColaCaracteres() {
        frente = 0;
        fin = 0;
        elementos = new char[maxCola];
    }

    public int getFrente() {
        return frente;
    }
    public void setFrente(int frente) {
        this.frente = frente;
    }

    public int getFin() {
        return fin;
    }
    public void setFin(int fin) {
        this.fin = fin;
    }

    public char[] getElementos() {
        return elementos;
    }
    public void setElementos(char[] elementos) {
        this.elementos = elementos;
    }

    public boolean estaVacia() {
        return fin == 0;
    }

    public boolean estaLlena() {
        return fin == maxCola;
    }

    // Encola un nuevo caracter al final
    public void encolar(char elem) {
        if (!estaLlena()) {
            elementos[fin] = elem;
            fin++;
        } else {
            System.out.println("La cola está llena, no se puede encolar más.");
        }
    }

    // Desencola el carácter más antiguo (el del frente)
    public char desencolar() {
        if (!estaVacia()) {
            char aux = elementos[frente]; // toma el primer elemento
            // desplaza todos los elementos hacia la izquierda
            for (int i = 0; i < fin - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            fin--; // reduce el final
            return aux;
        } else {
            System.out.println("La cola está vacía, no se puede desencolar.");
            return ' '; // valor por defecto
        }
    }

    // Devuelve el elemento del frente sin eliminarlo
    public char peek() {
        if (!estaVacia()) {
            return elementos[frente]; // lo muestra
        } else {
            System.out.println("La cola está vacía, no hay elementos para mostrar.");
            return ' ';
        }
    }

    // Muestra todo el contenido de la cola
    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.print("Cola: ");
            for (int i = 0; i < fin; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}