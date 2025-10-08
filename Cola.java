public class Cola{
    private final int maxcola=5;
    private int frente, fin;
    private int []elementos;

    public Cola() {
        frente=0;
        fin=0;
        elementos=new int[maxcola];
    }

    public boolean estaVacia() {
        return fin == 0; //Vacía si no se ha encolado nada
    }

    public boolean estaLlena() {
        return fin == maxcola; //Llena si fin llega al final
    }

    public void insertar(int elem) { //tmb encolar
        elementos[fin] = elem;
        fin++; // Avanza linealmente
    }

    public int borrar() { //tmb desencolar
        int aux = elementos[frente]; //Toma el primer elemento

        //Desplaza los elementos restantes hacia la izquierda
        for (int i =0; i<fin -1; i++) {
            elementos[i] = elementos [i + 1];
        }

        fin--; //Reduce fin tras el desplazamiento
        return aux;
    }

    public int peek() {
        return frente;
    }
}