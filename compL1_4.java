import java.util.Scanner;

public class compL1_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int numero = scan.nextInt();
        scan.close();
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
