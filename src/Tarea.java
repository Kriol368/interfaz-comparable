public class Tarea implements Comparable<Tarea>{
    private int prioridad;
    private int duracion;

    public Tarea(int prioridad, int duracion) {
        this.prioridad = prioridad;
        this.duracion = duracion;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public int getDuracion() {
        return this.duracion;

    }

    public String toString() {
        return this.getPrioridad() + " " + this.getDuracion();
    }

   /* public int compareTo(Tarea tarea) {
        if (this.prioridad== tarea.getPrioridad()) {
            return 0;
        } else if (this.prioridad > tarea.getPrioridad()) {
            return 1;
        } else {
            return -1;
        }
    } */

    @Override
    public int compareTo(Tarea tarea) {
        if (this.prioridad == tarea.getPrioridad()){
            return this.duracion - tarea.getDuracion();
        }else {
            return tarea.prioridad - this.getPrioridad();
        }
    }
}
