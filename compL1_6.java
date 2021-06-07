import java.util.Scanner;

public class compL1_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int numero = scan.nextInt();
        System.out.print("Ingrese el valor del exponente: ");
        int exponente = scan.nextInt();
        scan.close();
        int resultado = numero;
        for (int i = 1; i < exponente; i++) {
            resultado =  resultado * numero;
        }
        System.out.println(numero + " elevado a " + exponente + " es " + resultado);
    }
}