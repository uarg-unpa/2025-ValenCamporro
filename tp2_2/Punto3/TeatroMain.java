package tp2_2.Punto3;

/* Implemente dichas clases. */

public class TeatroMain {
    public static void main(String[] args) {
        
        Obra obra1 = new Obra("El Fantasma de la Opera", 3500);
        Obra obra2 = new Obra("Romeo y Julieta", 2800);
        Obra obra3 = new Obra("Esperando la Carroza", 2500);

        Teatro teatro = new Teatro("Teatro Colón", "Calle cerrito 628", obra1, obra2, obra3);

        System.out.println(teatro);
    }
}