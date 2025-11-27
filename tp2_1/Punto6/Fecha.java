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

    public boolean esFechaValida(int d, int m, int a) {
        if (a <= 0) {
            return false;
        } else {
            if (m < 1 || m > 12) {
                return false;
            } else {
                if (d < 1) {
                    return false;
                }
            }

        }

        int diasMes;
        switch (m) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            diasMes = 31;
            break;
        case 4: case 6: case 9: case 11:
            diasMes = 30;
            break;
        case 2:
            diasMes = 28;
            break;
        default:
            return false;
        }   

        return d <= diasMes;

    }

    /* Obtener el nombre del mes de la fecha (ejemplo: si el mes es 1, obtener Enero). */
    public String nombreMes() {
        switch (this.mes) {
        case 1:
            return "Enero";
        case 2:
            return "Febrero";
        case 3: 
            return "Marzo";
        case 4: 
            return "Abril";
        case 5: 
            return "Mayo";
        case 6: 
            return "Junio";
        case 7: 
            return "Julio";
        case 8: 
            return "Agosto";
        case 9: 
            return "Septiembre";
        case 10:
            return "Octubre";
        case 11:
            return "Noviembre";
        case 12:    
            return "Diciembre";
        default:
            return "Mes inválido";
        }
    }

    /* Mostrar la fecha de la siguiente forma: 1 de Setiembre de 2012. */
    public String toString() {
        return this.dia + " de " + nombreMes() + " de " + this.anio;
    }
}