package tp6.Punto11;

/* 11. Escribe un método recursivo que cuente las ocurrencias de un número dado en un arreglo de
enteros.
Pista: Compara el elemento actual con el número buscado y llama recursivamente con el resto del
arreglo */

public class ocurrencias {
    public static void main(String[] args) {
        
        int[] v = {2, 5, 2, 7, 2, 1};
        System.out.println(contar(v, 0, 2));
    }

    public static int contar(int[] v, int idx, int buscado) {
        if (idx == v.length) return 0;

        int suma = 0;
        if (v[idx] == buscado) {
            suma = 1;
        }

        return suma + contar(v, idx + 1, buscado);
    }
}