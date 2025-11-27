package tp6.Punto10;

/* 10. Escribe un método recursivo que encuentre el valor mínimo en un arreglo de enteros.
Pista: Divide el problema en dos partes: el elemento actual y el mínimo de los elementos restantes
del arreglo. */

public class valorMin {
    public static void main(String[] args) {

        int[] v = {5, 2, 9, 1, 7};
        System.out.println(minimo(v, 0));
    }

    public static int minimo(int[] v, int idx) {
        if (idx == v.length - 1) return v[idx];

        int resto = minimo(v, idx + 1);

        if (v[idx] < resto) {
            return v[idx];
        } else {
            return resto;
        }
    }
}