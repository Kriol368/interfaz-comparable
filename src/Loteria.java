import java.util.*;

public class Loteria {
    public static void añadirResultados(ArrayList<Localidad> resultados) {
        Scanner scanner = new Scanner(System.in);
        int comprados = scanner.nextInt();
        int premios = scanner.nextInt();
        Localidad actual = new Localidad(comprados, premios);
        resultados.add(actual);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        while (numero != 0) {
            numero = scanner.nextInt();
            ArrayList<Localidad> resultados = new ArrayList<>();
            for (int i = 0; i < numero; i++) {
                añadirResultados(resultados);
            }
            Comparator<Localidad> comparator = Comparator
                    .comparing(Localidad::getComprados)
                    .thenComparing(Localidad::getPremios);

            Collections.sort(resultados,comparator);

            boolean justo = true;
            for (int i = 1; i < resultados.size(); i++) {
                if (resultados.get(i).getPremios() <= resultados.get(i-1).getPremios()){
                    justo = false;
                    break;
                }
            }

            if (justo){
                System.out.println("SI");
            }else {
                System.out.println("NO");
            }
        }

    }
}
