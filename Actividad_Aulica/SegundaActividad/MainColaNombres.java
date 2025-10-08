package Actividad_Aulica.SegundaActividad;

public class MainColaNombres {
    public static void main(String[] args) {
        
        ColaNombres cola = new ColaNombres();
        
        System.out.println("- 8 nombres encolados -");
        cola.encolar("Valentina");
        cola.encolar("Malen");
        cola.encolar("Beatriz");
        cola.encolar("Fabiana");
        cola.encolar("Marcos");
        cola.encolar("Martina");
        cola.encolar("Alexis");
        cola.encolar("Farah");

        cola.mostrarCola();

        System.out.println("- 3 nombres desencolados -");
        cola.desencolar();
        cola.desencolar();
        cola.desencolar();

        cola.mostrarCola();

        cola.peek();

        System.out.println("- Más nombres encolados para probar la circularidad -");
        cola.encolar("Ana");
        cola.encolar("Anacleto");
        cola.encolar("Anastasio");
        
        cola.mostrarCola();

        System.out.println("¿Está llena? " + cola.estaLlena());
        System.out.println("¿Está vacía? " + cola.estaVacia());
    }
}