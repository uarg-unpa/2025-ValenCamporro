package Punto8;

/* 8. Implementar una clase Cadena que permita ingresar una cadena de caracteres (String) y que tenga el
método esPalindromo() que retorna verdadero si la secuencia de caracteres se lee igual de izquierda a derecha
y viceversa. */

public class Cadena {
    
    private String oracion;

    public Cadena(String oracion) {
        this.oracion = oracion;
    }

    public String getOracion() {
        return oracion;
    }
    public void setOracion(String o) {
        this.oracion = o;
    }

    public String esPalindromo() {
        if (oracion == null) {
            return "no es palíndromo";
        }

        int longitud = oracion.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (oracion.charAt(i) != oracion.charAt(longitud - 1 - i)) {
                return "no es palíndromo";
            }
        }
        return "es palíndromo";
    }
}