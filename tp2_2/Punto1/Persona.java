package tp2_2.Punto1;

/* Implementar una clase Persona.
Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan
directamente a ellos. Todos los atributos menos el DNI serán valores por defecto según su tipo (0 números,
cadena vacía para String, etc.).
Se implementarán varios constructores:
 Un constructor por defecto.
 Un constructor con el nombre.
Los métodos que se implementaran son:
 esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
 comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. No será visible al exterior.
 toString(): devuelve toda la información del objeto. */

//no entendi muy bien este punto.
 
public class Persona {
    
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    //constructor por defecto
    public Persona(String dni, char sexo) {
        this.nombre = " ";
        this.edad = 0;
        this.dni = dni;
        this.sexo = comprobarSexo(sexo);
        this.peso = 0.0;
        this.altura = 0.0;
    }

    //constructor con el nombre
    public Persona(String n) {
        this.nombre = n;
    }

    public void setDni(String d) {
        this.dni = d;
    }
    public String getDni() {
        return this.dni;
    }

    public void setSexo(char s) {
        this.sexo = s;
    }
    public char getSexo() {
        return this.sexo;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }
    public String getNombre() {
        return this.nombre;
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    private char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        } else {
            return 'X';
        }
    }

    public String toString() {
        return "Nombre: " + nombre + " - Edad: " + edad + " - DNI: " + dni + " - Sexo: " + sexo + " - Peso: " + peso + " - Altura: " + altura + " m";
    }
}