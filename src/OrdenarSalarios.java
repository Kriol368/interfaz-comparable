import java.util.ArrayList;
import java.util.List;


public class OrdenarSalarios {
    public static void main(String[] args) {
        List<Human> human = new ArrayList<>();
        human.add(new Human("mikael", 1000));
        human.add(new Human("matti", 3000));
        human.add(new Human("ada", 2000));
        human.stream().sorted().forEach(m -> System.out.println(m));
    }

}
