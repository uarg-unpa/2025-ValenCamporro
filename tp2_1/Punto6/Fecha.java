package tp2_1.Punto6;

/* Una fecha se compone de 3 elementos: día, mes y año. Codificar la clase Fecha. */

public class Fecha {
    
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        validarFecha(dia, mes, anio);
    }

    public void setDia(int d) {
        this.dia = d;
    }
    public int getDia() {
        return this.dia;
    }

    public void setMes(int m) {
        this.mes = m;
    }
    public int getMes() {
        return this.mes;
    }

    public void setAnio(int a) {
        this.anio = a;
    }
    public int getAnio() {
        return this.anio;
    }

    /* Cuando se crea el objeto de la clase Fecha, los valores de día, mes y año deben ser
    válidos (es decir, una fecha correcta en Argentina). Si alguno es inválido, generar la fecha 01/01/1900. */
    public void validarFecha(int d, int m, int a) {
        if (esFechaValida(d, m, a)) {
            this.dia = d;
            this.mes = m;
            this.anio = a;
        } else {
            this.dia = 01;
            this.mes = 01;
            this.anio = 1900;
        }
    }

    
}
