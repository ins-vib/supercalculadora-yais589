

package org.yourcompany.calculadora;
import java.util.Scanner;
/**
 *
 * @author Posa el teu nom
 */


public class Calculadora {

    public static void main(String[] args) {

        mostrarMenu();
/*         // Exemples de crida per al mètode nombreDigits
        System.out.println("Nombre de dígits de 1234: " + nombreDigits(1234));
        System.out.println("Nombre de dígits de 56789: " + nombreDigits(56789));
        System.out.println("Nombre de dígits de -101010: " + nombreDigits(-101010));
        System.out.println("Nombre de dígits de 0: " + nombreDigits(0));

        // Exemples de crida per al mètode sumaPrimersNumeros

        System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(5));
        System.out.println("Suma dels primers 10 números: " + sumaPrimersNumeros(10));
         System.out.println("Suma dels primers 15 números: " + sumaPrimersNumeros(15));

        // Exemples de crida per al mètode calcularFactorial
         System.out.println("Factorial de 5: " + calcularFactorial(5));
         System.out.println("Factorial de 7: " + calcularFactorial(7));
         System.out.println("Factorial de 10: " + calcularFactorial(10));

        // Exemples de crida per al mètode sumaQuadrats
         System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(3));
         System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
         System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));

        // Exemples de crida per al mètode calcularPotencia
         System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
         System.out.println("5 elevat a la potència 4: " + opcio = teclat.nextInt();calcularPotencia(5, 4));
         System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));
 */
    }
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

    // Suma dels primers n números naturals 
    public static int sumaPrimersNumeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
      
    }

    // Calcula el factorial de un número n 
    public static long calcularFactorial(int n) {
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Suma dels quadrats dels primers n números naturals 
    public static int sumaQuadrats(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }
        return suma;
      
    }

    // Calcula base elevat a l'exponent 
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