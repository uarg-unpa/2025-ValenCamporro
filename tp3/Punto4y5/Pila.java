package Punto4y5;

/* 4) Utilizando la clase Pila implementada con arreglo únicamente (no utiliza índice cima), escribir un
programa que permita meter y sacar elementos de la pila. Cada vez que se realice una operación deberá
informar cuantos elementos hay en la pila y cuantos elementos le faltan para llegar al máximo. */

/* 5) Agregar a la clase Pila el método elementoCima() que retorne el elemento cima sin cambiar la pila. Nota:
no olvidar que si bien la pila se implementa como un arreglo, no debería manejarse como tal. */

public class Pila {
    
    private char[] elementos;
    private int cantidad;

    public Pila (int capacidad) {
        elementos = new char[capacidad];
        cantidad = 0;
    }

    public char[] getElementos() {
        return elementos;
    }
    public void setElementos(char[] elementos) {
        this.elementos = elementos;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean estaVacia() {
        return cantidad == 0;
    }

    public boolean estaLlena() {
        return cantidad == elementos.length;
    }

    public void meter(char c) {
        if (!estaLlena()) {
            elementos[cantidad] = c;
            cantidad++;
            informarEstado("Se metió el elemento: " + c);
        } else {
            System.out.println("La pila está llena, no se puede meter más elementos.");
        }
    }

    public char sacar() {
        if (!estaVacia()) {
            char valor = elementos[cantidad - 1];
            cantidad--;
            informarEstado("Se sacó el elemento: " + valor);
            return valor;
        } else {
            System.out.println("La pila está vacía, no se puede sacar elementos.");
            return '\0'; //el '\0' significa que devuelve nulo.
        }
    }

    public char elementoCima() {
        if (!estaVacia()) {
            return elementos[cantidad - 1];
        } else {
            System.out.println("La pila está vacía.");
            return '\0';
        }
    }

    public void informarEstado(String mensaje) {
        System.out.println(mensaje);
        System.out.println("Elementos en la pila: " + cantidad);
        System.out.println("Faltan " + (elementos.length - cantidad) + " elementos para llenarla.");
        System.out.println();
    }
}