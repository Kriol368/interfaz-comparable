public class Niño implements Comparable<Niño>{

    private int bueno;
    private int peso;

    public Niño(int bueno, int peso) {
        this.bueno = bueno;
        this.peso = peso;
    }

    public int getBueno() {
        return this.bueno;
    }

    public int getPeso() {
        return this.peso;

    }

    public String toString() {
        return this.getBueno() + " " + this.getPeso();
    }


    @Override
    public int compareTo(Niño other) {
        if (this.bueno == other.getBueno()){
            return this.peso - other.getPeso();
        }else {
            return other.bueno - this.getBueno();
        }
    }
}
