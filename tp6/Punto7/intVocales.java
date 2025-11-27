package tp6.Punto7;

/* 7. Escribir un método recursivo int vocales(String cd) para calcular el número de vocales de una
cadena. */

public class intVocales {
    public static void main(String[] args) {

        String s = "recursion";
        int v = vocales(s, 0);
        System.out.println("Vocales: " + v);
    }

    public static int vocales(String s, int p) {
        if (p == s.length()) return 0;

        char c = Character.toLowerCase(s.charAt(p));
        int suma = 0;

        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
            suma = 1;
        }

        return suma + vocales(s, p + 1);
    }
}