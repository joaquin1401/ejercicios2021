import java.util.Scanner;

public class compL1_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int numero = scan.nextInt();
        System.out.print("Ingrese el valor por el que desea multiplicar: ");
        int multiplicando = scan.nextInt();
        scan.close();
        int resultado = 0;
        for (int i = 1; i <= numero; i++) {
            resultado = resultado + multiplicando;
        }
        System.out.println(numero + " * " + multiplicando + " = " + resultado);
    }
}