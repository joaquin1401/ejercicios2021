import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class compL2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int numero;
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un valor: ");
            numero = scan.nextInt();
            numeros.add(numero);
        }
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " - ");
        }
        System.out.print("Ingrese un valor para agregarlo al final de la lista: ");
        numero = scan.nextInt();
        numeros.add(numero);
        System.out.print("Ingrese un valor para agregarlo al principio de la lista: ");
        numero = scan.nextInt();
        scan.close();
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " - ");
        }
    }
}
