import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion = 1;
        while (opcion == 1) {
            System.out.print("Ingrese un valor: ");
            int numero = scan.nextInt();
            System.out.println("Valor ingresado: " + numero);
            System.out.println("Ingrese 1 para seguir operando");
            opcion = scan.nextInt();
        }
        scan.close();
    }
}
