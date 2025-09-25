package tp2_2.Punto5;

public class EmpleadoMain {
    public static void main(String[] args) {
        
        Empleado e= new Empleado(12, 8000000, 5000, 4, true, 3);

        System.out.println("Legajo: " + e.getLegajo());
        System.out.println("Sueldo base: " + e.getSueldoBase());
        System.out.println("Complemento horas extra: " + e.complementoHorasExtra());
        System.out.println("Sueldo bruto: " + e.calcularSueldoBruto());
        System.out.println("Retenciones: " + e.retenciones());
    }
}
