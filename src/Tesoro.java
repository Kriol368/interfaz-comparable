public class Tesoro implements Comparable<Tesoro>{
    private int valor;
    private int peso;

    private String nombre;

    public Tesoro(int valor, int peso, String nombre) {
        this.valor = valor;
        this.peso = peso;
        this.nombre = nombre;
    }

    public int getValor() {
        return this.valor;
    }

    public int getPeso() {
        return this.peso;

    }
    public String getNombre(){
        return this.nombre;
    }

    public String toString() {
        return this.nombre;
    }


    @Override
    public int compareTo(Tesoro other) {
        if (this.valor == other.getValor()){
            return this.peso - other.getPeso();
        }else {
            return other.getValor() - this.getValor();
        }
    }
}
