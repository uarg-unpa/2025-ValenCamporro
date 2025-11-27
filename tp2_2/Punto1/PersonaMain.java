package tp2_2.Punto1;

 /* Testear la clase implementada. */

public class PersonaMain {
    public static void main(String[] args) {
        
        Persona p1 = new Persona("12.345.678", 'M');
        System.out.println("- Persona 1 -");
        System.out.println(p1);
        System.out.println();

        Persona p2 = new Persona("Valentina");
        System.out.println("- Persona 2 -");
        System.out.println(p2);
        System.out.println();

        System.out.println("¿La persona 1 es mayor de edad?: " + p1.esMayorDeEdad());
        System.out.println("¿La persona 2 es mayor de edad?: " + p2.esMayorDeEdad());
    }
}