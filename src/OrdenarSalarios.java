import java.util.ArrayList;
import java.util.List;


public class OrdenarSalarios {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("mikael", 1000));
        humans.add(new Human("matti", 3000));
        humans.add(new Human("ada", 2000));
        humans.stream().sorted().forEach(m -> System.out.println(m));
    }

}
