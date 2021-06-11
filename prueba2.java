import java.util.*;
public class prueba2 {
    public static void main(String[] args) {
        // Los caracteres de interés en un array de char.
        char [] chars = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();

        // Longitud del array de char.
        int charsLength = chars.length;

        // Instanciamos la clase Random
        Random random = new Random();

        // Un StringBuffer para componer la cadena aleatoria de forma eficiente
        StringBuffer buffer = new StringBuffer();

        // Bucle para elegir una cadena de 10 caracteres al azar
        for (int i=0;i<10;i++){

        // Añadimos al buffer un caracter al azar del array
        buffer.append(chars[random.nextInt(charsLength)]);
        }

        // Y solo nos queda hacer algo con la cadena
        System.out.println("Random String " + buffer.toString());



        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Primero lo imprimimos de manera original
        System.out.println("Original:");
        for (int value : array) System.out.print(value + " ");
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            // Restamos 1 de array.length porque los índices comienzan en 0
            int randomIndex = getRandomNumber(0, array.length - 1);
            // Hacemos el intercambio...
            // Almacenamos el actual en una temporal
            int temp = array[currentIndex];
            // Al actual le colocamos lo que haya en un índice aleatorio
            array[currentIndex] = array[randomIndex];
            // Y lo que había en el índice aleatorio lo remplazamos por lo que hay en temporal
            array[randomIndex] = temp;
        }
        // Y al final lo volvemos a imprimir, ya desordenado
        System.out.println("\nDesordenado");
        for (int value : array) System.out.print(value + " ");
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class compL2_3 {
    public static void main(String[] args) {
        List<Integer> cartas = new ArrayList<>();
        cargar(cartas);
        mostrar(cartas);
        //mezclar(cartas);
        //mostrar(cartas);
        System.out.println();
    }
    public static void cargar(List<Integer> arr){
        for (int i = 1; i <= 12; i++) {
            arr.add(i);
        }
    }
    public static void mostrar(List<Integer> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
    public static int getRandomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    public static void mezclar(List<Integer> array){
        int j;
        for (int i = 0; i < array.size(); i++) {
            // Restamos 1 de array.size() porque los índices comienzan en 0
            j = getRandomNumber(0, array.size() - 1);
            // Hacemos el intercambio...
            // Almacenamos el actual en una temporal
            int temp = array.get(i);
            // Al actual le colocamos lo que haya en un índice aleatorio
            array.add(i, array.get(j));
            // Y lo que había en el índice aleatorio lo remplazamos por lo que hay en temporal
            array.add(j, temp);
        }
    }
}
