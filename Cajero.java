import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);

     int valor;
     int denominacion500 = 500;
     int denominacion200 = 200;
     int denominacion100 = 100;
     int denominacion50 = 50;
     int denominacion20 = 20;

     System.out.print(  "Cuanto desea retirar?" );
     valor = scan.nextInt();

    int billetes500 = valor / denominacion500;
    int residuo1 = valor % denominacion500;
    int billetes200 = residuo1 / denominacion200;
    int residuo2 = residuo1 % denominacion200;
    int billetes100 = residuo2 / denominacion100;
    int residuo3 = residuo2 % denominacion100;
    int billetes50 = residuo3 / denominacion50;
    int residuo4 = residuo3 % denominacion50;
    int billetes20 = residuo4 / denominacion20;
    int residuo5 = residuo4 % denominacion20;

    System.out.println("Billetes de 500: " + billetes500);
    System.out.println("Billetes de 200: " + billetes200);
    System.out.println("Billetes de 100: " + billetes100);
    System.out.println("Billetes de 50: " + billetes50);
    System.out.println("Billetes de 20: " + billetes20);
    System.out.println( "Sobrante de: " + residuo5);
 

}
}