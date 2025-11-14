

package org.yourcompany.calculadora;
import java.util.Scanner;
/**
 *
 * @author yazan issa 
 */


public class Calculadora {

    public static void main(String[] args) {

        mostrarMenu();
        }

    
     /**
     * Calcula el nombre de dígits d’un número enter.
     * Funciona tant per a nombres positius com negatius.
     * Si el nombre és 0, retorna 1.
     *
     * @param nombre Número del qual es vol saber el nombre de dígits
     * @return Quantitat de dígits que té {@code nombre}
     */

        // Comptar el nombre de dígits d'un nombre enter
    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1; 
        }
        int comptador = 0;
        while (nombre != 0) {
            nombre /= 10;
            comptador++;
        }
        return comptador;
    }

        /**
        * Calcula la suma dels primers n números naturals.
        *
        * @param n1 Nombre fins on sumar (números naturals)
        * @return La suma des de 1 fins a n1 inclòs
        */
    public static int sumaPrimersNumeros(int n1) {
        int suma = 0;
        for (int i = 1; i <= n1; i++) {
            suma += i;
        }
        return suma;
      
    }



        /**
        * Calcula el factorial d'un número enter n.
        * El factorial de n (n!) és el producte de tots els enters positius de 1 a n.
        * Per convenció, el factorial de 0 és 1.
        *
        * @param n2 Número del qual es vol calcular el factorial
        * @return El factorial de n2 com un valor long
        */
    public static long calcularFactorial(int n2) {
        long factorial = 1;
        for (int i = 2; i <= n2; i++) {
            factorial *= i;
        }
        return factorial;
    }

        /**
        * Calcula la suma dels quadrats dels primers n números naturals.
        *
        * @param n3 Nombre fins on sumar els quadrats (números naturals)
        * @return La suma dels quadrats des de 1 fins a n3 inclòs
        */
    public static int sumaQuadrats(int n3) {
        int suma = 0;
        for (int i = 1; i <= n3; i++) {
            suma += i * i;
        }
        return suma;
      
    }




        /**
        * Calcula la potència d'una base elevada a un exponent.
        *
        * @param base La base de la potència
        * @param exponent L'exponent al qual s'eleva la base
        * @return El resultat de base elevat a l'exponent com un valor long
        */
    public static long calcularPotencia(int base, int exponent) {
        long resultat = 1;
        for (int i = 1; i <= exponent; i++) {
            resultat *= base;
        }
        return resultat;
    }
    
public static void mostrarMenu() {
        Scanner teclat = new Scanner(System.in);
        int opcio = -1;

        while (opcio != 0) {
            System.out.println("\nMenú:");
            System.out.println("1. Número de xifres");
            System.out.println("2. Sumar fins a n");
            System.out.println("3. Factorial d'un número");
            System.out.println("4. Suma de quadrats");
            System.out.println("5. Potència");
            System.out.println("0. Sortir");
            System.out.print("Entra opció: ");

            opcio = teclat.nextInt();

            switch (opcio) {
                case 1:
                    System.out.print("Entra número: ");
                    int n1 = teclat.nextInt();
                    int nd = nombreDigits(n1);
                    System.out.println("Resultat: " + nd);
                    break;
                case 2:
                    System.out.print("Entra n: ");
                    int n2 = teclat.nextInt();
                    int suma = sumaPrimersNumeros(n2);
                    System.out.println("Resultat: " + suma);
                    break;
                case 3:
                    System.out.print("Entra n: ");
                    int n3 = teclat.nextInt();
                    long fact = calcularFactorial(n3);
                    System.out.println("Resultat: " + fact);
                    break;
                case 4:
                    System.out.print("Entra n: ");
                    int n4 = teclat.nextInt();
                    int sumaQ = sumaQuadrats(n4);
                    System.out.println("Resultat: " + sumaQ);
                    break;
                case 5:
                    System.out.print("Entra base: ");
                    int base = teclat.nextInt();
                    System.out.print("Entra exponent: ");
                    int exp = teclat.nextInt();
                    long pot = calcularPotencia(base, exp);
                    System.out.println("Resultat: " + pot);
                    break;
                case 0:
                    System.out.println("Sortint...");
                    break;
                default:
                    System.out.println("Opció incorrecta.");
            }
        }

}
}