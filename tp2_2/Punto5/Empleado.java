package tp2_2.Punto5;

/* Crear una clase Empleado que modele la información que una empresa mantiene sobre cada empleado:
número de legajo, sueldo base, pago por hora extra, horas extra realizadas en el mes, casado o no y número de
hijos. Los servicios que deberán proporcionar los objetos de la clase serán los siguientes:
Cálculo y devolución del complemento correspondiente a las horas extra realizadas.
Cálculo y devolución del sueldo bruto.
Cálculo y devolución de las retenciones, teniendo en cuenta que el porcentaje de retención que hay que
aplicar es 10% del sueldo base si el empleado está casado más 1% por cada hijo que tenga. */

public class Empleado {
    
    private int legajo;
    private double sueldoBase;
    private double pagoHoraExtra;
    private int horasExtra;
    private boolean casado;
    private int hijos;

    public Empleado(int legajo, double sueldoBase, double pagoHoraExtra, int horasExtra, boolean casado, int hijos) {
        this.legajo = legajo;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
        this.horasExtra = horasExtra;
        this.casado = casado;
        this.hijos = hijos;
    }

    public void setLegajo(int l) {
        this.legajo = l;
    }
    public int getLegajo() {
        return this.legajo;
    }

    public void setSueldoBase(double sb) {
        this.sueldoBase = sb;
    }
    public double getSueldoBase() {
        return this.sueldoBase;
    }
    
    public void setPagoHoraExtra(double phe) {
        this.pagoHoraExtra = phe;
    }
    public double getPagoHoraExtra() {
        return this.pagoHoraExtra;
    }

    public void setHorasExtra(int he) {
        this.horasExtra = he;
    }
    public int getHorasExtra() {
        return this.horasExtra;
    }

    public void setCasado(boolean c) {
        this.casado = c;
    }
    public boolean getCasado() {
        return this.casado;
    }

    public void setHijos(int h) {
        this.hijos = h;
    }
    public int getHijos() {
        return this.hijos;
    }

    // Cálculo y devolución del complemento correspondiente a las horas extra realizadas.
    public double complementoHorasExtra() {
        return pagoHoraExtra * horasExtra;
    }

    // Cálculo y devolución del sueldo bruto.
    public double calcularSueldoBruto() {
        return sueldoBase + complementoHorasExtra();
    }

    /* Cálculo y devolución de las retenciones, teniendo en cuenta que el porcentaje de retención que hay que
    aplicar es 10% del sueldo base si el empleado está casado más 1% por cada hijo que tenga. */
    public double retenciones() {
        double porcentaje = 0.0;
        if (casado) {
            porcentaje += 10;
        } else {
            porcentaje += 0;
        }
        porcentaje += hijos;
        return (sueldoBase * porcentaje) / 100; 
    }



}