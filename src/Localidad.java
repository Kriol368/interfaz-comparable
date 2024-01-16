public class Localidad implements Comparable<Localidad>{
    private int comprados;
    private int premios;

    public Localidad(int invertido, int ganado) {
        this.comprados = invertido;
        this.premios = ganado;
    }

    public int getComprados() {
        return this.comprados;
    }

    public int getPremios() {
        return this.premios;
    }
    public String toString() {
        return this.getComprados() + " " + this.getPremios();
    }

    public int compareTo(Localidad other) {
        if (this.premios == other.getPremios()){
            return other.getPremios() - this.getPremios();
        }else {
            return other.getPremios() - this.getPremios();
        }
    }


}
