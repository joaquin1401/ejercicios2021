import java.util.List;

public class compL2_3 {
    public static void main(String[] args) {
        List<Integer> baraja = new List<Integer>;
        cargar(baraja);
        mostrar(baraja);
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
}
