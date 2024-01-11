public class Iliterate implements Comparable<Iliterate> {

    private String name;
    private int number;

    public Iliterate(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
    @Override
    public String toString() {
        return this.getName() + " (" + this.getNumber() + ")";
    }

    @Override
    public int compareTo(Iliterate iliterate) {
        if (this.number == iliterate.getNumber()) {
            return 0;
        } else if (this.number > iliterate.getNumber()) {
            return 1;
        } else {
            return -1;
        }
    }
}
