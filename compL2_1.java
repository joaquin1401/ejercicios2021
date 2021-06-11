import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class compL2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> ciudades = new ArrayList<>();
        String ciudad;
        int condicion = 1;
        int i = 0;
        while (condicion == 1) {
            System.out.print("Ingrese una ciudad: ");
            ciudad = scan.next();
            ciudades.add(ciudad);
            System.out.print("Ingrese 1 para seguir operando: ");
            condicion = scan.nextInt();
        }
        scan.close();
        for (i = 0; i < ciudades.size(); i++) {
            System.out.println("#" + (i + 1) + " " + ciudades.get(i));
        }        
    }
}
