package tp2_1.Punto2;

/* Implemente en código JAVA, 4 clases de las definidas en el punto 1. (ALUMNO) */

public class Alumno {

    //Atributos
    private String nombre;
    private String apellido;
    private int legajo;
    private int edad;
    private String carrera;

    //Constructor
    public Alumno(String nombre, String apellido, int legajo, int edad, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.edad = edad;
        this.carrera = carrera;
    }

    //Getters y setters
    public void setNombre(String n) {
        this.nombre = n;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setApellido(String a) {
        this.apellido = a;
    }
    public String getApellido() {
        return this.apellido;
    }

    public void setLegajo(int l) {
        this.legajo = l;
    }
    public int getLegajo() {
        return this.legajo;
    }

    public void setEdad(int e) {
        this.edad = e;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setCarrera(String c) {
        this.carrera = c;
    }
    public String getCarrera() {
        return this.carrera;
    }

    //Métodos
    public void inscribirseCurso(String curso) {
        System.out.println("Se inscribió en: " + curso);
    }

    public void rendirExamen(String materia) {
        System.out.println("Rindió examen de: " + materia);
    }

    public String toString() {
        return nombre + apellido + " - legajo: " + legajo;
    }
}