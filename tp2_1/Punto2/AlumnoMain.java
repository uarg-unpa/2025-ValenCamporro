package tp2_1.Punto2;

public class AlumnoMain {
    public static void main(String[] args) {

        Alumno alumno = new Alumno("Valentina", "Camporro", 12345, 20, "Sistemas");

        alumno.inscribirseCurso("Programación de Algoritmos");
        alumno.rendirExamen("Matemáticas II");

        System.out.println("Detalles del alumno:");
        System.out.println(alumno);
    }
}
