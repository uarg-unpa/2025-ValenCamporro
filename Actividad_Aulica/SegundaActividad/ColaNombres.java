package Actividad_Aulica.SegundaActividad;

/* 2. Ejercicio 2: Cola con Frente y Final Movibles (Gestión de Nombres)

   Implementa una clase ColaNombres que use una cola circular con frente y final movibles. El programa debe manejar una cola de cadenas (String)
   que represente una lista de nombres de estudiantes en una fila de atención. Crea un MainColaNombres que permita:

   - Encolar un nuevo nombre ingresado por el usuario.
   - Desencolar el nombre del estudiante más antiguo: Esto implica eliminar y retornar el nombre que fue encolado primero (el que está en la posición indicada por frente),
   moviendo frente circularmente  para respetar el principio FIFO, asegurando que la cola avance de forma circular y reutilice el espacio.
   - Mostrar el nombre en el frente sin desencolarlo (usando peek).
   - Mostrar el estado de la cola (vacía, llena ).
   Prueba la cola encolando 8 nombres, desencolando 3 y verificando que los nombres se muevan circularmente.

   Recordatorio: Como en el ejercicio anterior, revisaron con la profesora el método peek y deben mejorarlo. Eviten acceder directamente al array con elementos[frente].
   Implementen peek como un método que refleje el manejo de la cola, simulando su lógica FIFO (aunque las validaciones queden en el main),
   para que sea consistente con el diseño de la estructura.*/

public class ColaNombres {
    
    private final int maxCola = 10;
    private String[] elementos;
    private int frente;
    private int fin;
    private int cantidad;

    public ColaNombres() {
        elementos = new String[maxCola];
        frente = 0;
        fin = -1;
        cantidad = 0;
    }

    public int getFrente() {
        return frente;
    }
    public void setFrente(int frente) {
        this.frente = frente;
    }

    public int getFin() {
        return fin;
    }
    public void setFin(int fin) {
        this.fin = fin;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String[] getElementos() {
        return elementos;
    }
    public void setElementos(String[] elementos) {
        this.elementos = elementos;
    }

    public boolean estaVacia() {
        return cantidad == 0;
    }

    public boolean estaLlena() {
        return cantidad == maxCola;
    }

    // Método para encolar un nuevo nombre
    public void encolar(String nombre) {
        if (!estaLlena()) {
            // avanza circularmente el fin
            fin = (fin + 1) % maxCola;
            elementos[fin] = nombre;
            cantidad++;
        } else {
            System.out.println("La cola está llena, no se puede encolar más nombres.");
        }
    }

    // Método para desencolar el nombre más antiguo
    public String desencolar() {
        if (!estaVacia()) {
            String nombre = elementos[frente];
            // avanza circularmente el frente
            frente = (frente + 1) % maxCola;
            cantidad--;
            return nombre;
        } else {
            System.out.println("La cola está vacía, no hay nada que desencolar.");
            return null; // no hay nada para devolver
        }
    }

    // Método para mostrar el nombre que está en el frente (sin eliminarlo)
    public String peek() {
        if (!estaVacia()) {
            // accede al frente actual, simulando el comportamiento FIFO
            String nombreFrente = elementos[frente];
            System.out.println("El nombre en el frente es: " + nombreFrente);
            return nombreFrente;
        } else {
            System.out.println("La cola está vacía, no hay elemento en el frente.");
            return null;
        }
    }

    // Muestra todos los nombres actualmente en la cola
    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Contenido de la cola:");
            int indice = frente;
            for (int i = 0; i < cantidad; i++) {
                System.out.print(elementos[indice] + " ");
                indice = (indice + 1) % maxCola; // avance circular
            }
            System.out.println();
        }
    }
}