package Punto9;

public class AritmeticaMain {
    public static void main(String[] args) {

        Aritmetica verificador = new Aritmetica(50);
        
        System.out.println(verificador.resultado("[(a % b) * c]"));
        System.out.println(verificador.resultado("2 * (a + b)]] / 2.5 + x"));
        System.out.println(verificador.resultado("{(c - d) * [(c + a / t]"));
    }
}