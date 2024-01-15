import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class FelipeYSusTareas {

    public static void añadirTareas(ArrayList<Tarea> tareas){
        Scanner scanner = new Scanner(System.in);
        int prioridad = scanner.nextInt();
        int duracion = scanner.nextInt();
        Tarea actual = new Tarea(prioridad,duracion);
        tareas.add(actual);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        while (numero != 0){
            numero = scanner.nextInt();
            ArrayList<Tarea> tareas = new ArrayList<>();
            for (int i = 0; i < numero; i++) {
               añadirTareas(tareas);
            }
           /* Comparator<Tarea> comparator = Comparator
                    .comparing(Tarea::getPrioridad)
                    .thenComparing(Tarea::getDuracion);
           tareas.stream().sorted(comparator).forEach(System.out::println); */
            tareas.stream().sorted().forEach(t -> System.out.println(t));

            if (numero != 0){
                System.out.println("---");
            }
        }
    }
}
