import java.util.Scanner;

public class compL1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int primero = scan.nextInt();
        System.out.print("Ingrese otro valor: ");
        int segundo = scan.nextInt();
        System.out.println(primero + " * " + segundo + " = " + (primero*segundo));
        System.out.println(primero + " + " + segundo + " = " + primero+segundo);
        System.out.println(primero + " - " + segundo + " = " + (primero-segundo));
        System.out.println(primero + " / " + segundo + " = " + primero/segundo);
        System.out.println(primero + " % " + segundo + " = " + primero%segundo);
    }
}
