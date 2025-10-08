package Actividad_Aulica.SegundaActividad;

public class MainColaCaracteres {
    public static void main(String[] args) {
        
        ColaCaracteres cola = new ColaCaracteres();

        System.out.println("- 5 comandos encolados -");
        cola.encolar('a');
        cola.encolar('b');
        cola.encolar('c');
        cola.encolar('d');
        cola.encolar('e');
        cola.mostrarCola();

        System.out.println("- 2 comandos desencolados -");
        cola.desencolar();
        cola.desencolar();
        cola.mostrarCola();

        System.out.println("Mostrar el frente: " + cola.peek());

        System.out.println("- Encolar más comandos hasta llenar la cola -");
        cola.encolar('f');
        cola.encolar('g');
        cola.encolar('h');
        cola.encolar('i');
        cola.encolar('j');
        cola.encolar('k');
        cola.encolar('l');
        cola.encolar('m'); // no entra
        cola.mostrarCola();

        System.out.println("¿Está llena? " + cola.estaLlena());
        System.out.println("¿Está vacía? " + cola.estaVacia());
    }  
}