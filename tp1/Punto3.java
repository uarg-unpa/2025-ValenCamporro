package tp1;

/* Se tienen 3 variables A, B y C enteras. Escribir un algoritmo que intercambie entre si sus valores, para que
queden finalmente de la siguiente forma:
- B y C toman el valor de A.
- A toma el valor original de C */
 
    public class Punto3 {
        public static void main(String[] args) {

            int a = 1;
            int b = 2;
            int c = 3;
            int aux;

            aux = c;
            b = a;
            c = a;
            a = aux;
    
            System.out.println("El valor original de A es: " + a);
            System.out.println("El valor de B es: " + b);
            System.out.println("El valor de C es: " + c);
        }
    }