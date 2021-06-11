import java.util.Scanner;

public class compL1_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scan.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scan.nextInt();
        System.out.print("Ingrese su ciudad: ");
        String ciudad = scan.nextLine();
        System.out.println();
        System.out.print("Ingrese su direccion: ");
        String direccion = scan.nextLine();
        System.out.println(nombre + " - " + edad + " - " + ciudad + " - " + direccion);
        scan.close();
    }
}
