import java.util.Scanner;

public class Calculadora {
 public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Escribir numero entero ");
    double num1 = scan.nextDouble();
    /* Se usa el double para agregar un segundo token o valor */

    System.out.print("Escribir numero entero ");
    double num2 = scan.nextDouble();

    double suma = num1 + num2;
    double resta = num1 - num2;
    double Multiplicacion = num1 * num2;
    double division = num1 / num2;

    System.out.println("La suma de los numeros es " + suma);
    System.out.println("La resta de los numeros es " + resta);
    System.out.println("La multiplicacion de los numeros es " + Multiplicacion);
    System.out.println("La division de los numeros es " + division);

    }
}