package Punto9;

/* 9. Realice un programa que lea una expresión aritmética y determine si tiene correctamente colocados los
separadores (),{},[]. Obtener la expresión como un String.
Ejemplo:
[(a % b) * c] → correcto
2 * (a + b)]] / 2.5 + x → incorrecto
{(c - d) * [(c + a / t] → incorrecto
Nota: puede utilizar una pila para registrar los diferentes tipos de agrupación de separadores. En cualquier
momento que encuentre un signo de estos abriendo la expresión lo mete en la pila y cada vez que encuentre
un signo terminal examina la pila. Si los signos coinciden, continúa testeando, caso contrario la expresión no
será correcta */

public class Aritmetica {
    
    private char[] pila;
    private int cima;

    public Aritmetica(int tamaño) {
        pila = new char[tamaño];
        cima = -1;
    }

    public char[] getPila() {
        return pila;
    }
    public void setPila(char[] pila) {
        this.pila = pila;
    }

    public int getCima() {
        return cima;
    }
    public void setCima(int cima) {
        this.cima = cima;
    }

    public void apilar(char c) {
        cima++;
        pila[cima] = c;
    }

    public char desapilar() {
        char aux = pila[cima];
        cima--;
        return aux;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean esValida(String expresion) {
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                apilar(c);
            } 
            else {
                if (c == ')' || c == '}' || c == ']') {
                    if (estaVacia()) {
                        return false;
                    } 
                    else {
                        char apertura = desapilar();
                        
                        if (!coinciden(apertura, c)) {
                            return false;
                        }
                    }
                }
            }
        }
        if (estaVacia()) {
            return true;
        } 
        else {
            return false;
        }
    }

    private boolean coinciden(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') || (apertura == '[' && cierre == ']') || (apertura == '{' && cierre == '}');
    }

    public String resultado(String expresion) {
        if (esValida(expresion)) {
            return expresion + " → correcto";
        } 
        else {
            return expresion + " → incorrecto";
        }
    }
}