import java.util.ArrayList;
import java.util.Scanner;
public class RepartirRegalos {
    public static void añadirRegalos(ArrayList<Niño> niños){
        Scanner scanner = new Scanner(System.in);
        int bueno = scanner.nextInt();
        int peso = scanner.nextInt();
        Niño actual = new Niño(bueno,peso);
        niños.add(actual);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        while (numero != 0){
            numero = scanner.nextInt();
            ArrayList<Niño> niños = new ArrayList<>();
            for (int i = 0; i < numero; i++) {
                añadirRegalos(niños);
            }

            niños.stream().sorted().forEach(t -> System.out.println(t));

            if (numero != 0){
                System.out.println("---");
            }
        }
    }
}
