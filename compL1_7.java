import java.util.Scanner;

public class compL1_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] minusculas = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'ñ', 'z', 'x', 'c', 'v', 'b', 'n', 'm'}; 
        char[] mayusculas = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'Ñ', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'};
        System.out.print("Ingrese un texto");
        String salida = new String();
        String texto = scan.nextLine();
        boolean bandera;
        for (int i = 0; i < texto.length(); i++) {
            bandera = true;
            for (int j = 0; j < minusculas.length; j++) {            
                if (minusculas[j] == texto.charAt(i)) {
                    salida = salida + mayusculas[j];
                    bandera = false;
                    break;
                }
            }
            if (bandera) {
                salida = salida + texto.charAt(i);
            }
        }
        System.out.println(salida);
        scan.close();
    
    }
}
