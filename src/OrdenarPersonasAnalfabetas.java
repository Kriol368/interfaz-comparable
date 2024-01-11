import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class OrdenarPersonasAnalfabetas {
    public static void main(String[] args) throws IOException {
        ArrayList<Iliterate> iliterates = new ArrayList<>();
        String filePath = new File("").getAbsolutePath();
        filePath = filePath.concat("/src/illiterate.csv");
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        reader.readLine();
        while ((line = reader.readLine()) != null) {
            String[] cadena = line.split(",");
            Iliterate actual = new Iliterate(cadena[5], Integer.parseInt(cadena[8]));
            iliterates.add(actual);
        }
        reader.close();
        iliterates.stream().sorted().distinct().forEach(System.out::println);



    }
}
