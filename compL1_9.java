import java.util.Scanner;

public class compL1_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scan.nextLine();
        System.out.print("Ingrese la letra que desea contabilizar: ");
        char letra = scan.next().charAt(0);
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (letra == frase.charAt(i)) {
                cont += 1;
            }
        }
        System.out.println("La letra " + letra + " aparce " + cont + " veces");
        scan.close();
    }
}
