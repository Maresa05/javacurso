import java.util.Scanner;

public class Prueba1 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    /* Para utilizar la variable Scanner se necesita crear un objeto Scanner con nombre (scan), esto indica de donde procedera la fuente de datos */

    System.out.print("Escribir numero entero ");
    byte num1 = scan.nextByte();

    /* byte = lee valores bytes introducidos */

    System.out.print("Escribir numero entero ");
    byte num2 = scan.nextByte();

    int var1 = num1 + num2;
    int var2 = num1 - num2;
    int var3 = num1 * num2;
    int var4 = num1 / num2;

    System.out.println("La suma de los numeros es " + var1);
    System.out.println("La resta de los numeros es " + var2);
    System.out.println("La multiplicacion de los numeros es " + var3);
    System.out.println("La division de los numeros es " + var4);
    }
}