package tp6.Punto9;

/* 9. Escribe un método recursivo que determine si un número está presente en un arreglo. Devuelve
true si el número se encuentra en el arreglo y false en caso contrario.
Pista: El caso base es cuando el tamaño del arreglo es 0, en cuyo caso el número no está presente. De
lo contrario, verifica el primer elemento del arreglo y llama recursivamente con el resto del arreglo. */

public class numPresente {
    public static void main(String[] args) {
        
        int[] v = {3, 9, 1, 7, 4};
        System.out.println(esta(v, 0, 7));
    }

    public static boolean esta(int[] v, int idx, int buscado) {
        if (idx == v.length) return false;
        if (v[idx] == buscado) return true;
        return esta(v, idx + 1, buscado);
    }
}