import java.util.ArrayList;

import java.util.Scanner;

public class ExtraccionDeTesoros {

    public static void añadirTesoros(ArrayList<Tesoro> tesoros){
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.next();
        int prioridad = scanner.nextInt();
        int duracion = scanner.nextInt();
        Tesoro actual = new Tesoro(prioridad,duracion,nombre);
        tesoros.add(actual);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        while (numero != 0){
            numero = scanner.nextInt();
            ArrayList<Tesoro> tesoros = new ArrayList<>();
            for (int i = 0; i < numero; i++) {
                añadirTesoros(tesoros);
            }

            tesoros.stream().sorted().forEach(t -> System.out.println(t));

            if (numero != 0){
                System.out.println("---");
            }
        }
    }
}
