import java.util.Scanner;

public class TareaOperacion1 {
    
    public static void main(String[] var0) {

        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Escribe una numero ");
        num1 = scan.nextInt();
        
        System.out.print("Escribe una numero ");
        num2 = scan.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);

    }
}
