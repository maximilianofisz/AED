package aed;

public class Horario {
    public int hora;
    public int minutos;

    public Horario(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public int hora() {
        return hora;
    }

    public int minutos() {
        return minutos;
    }

    @Override
    public String toString() {
        return hora + ":" + minutos;
    }

    @Override
    public boolean equals(Object otro) {
        boolean oen = (otro == null);

        boolean cd = otro.getClass() != this.getClass();

        if (oen || cd) {
            return false;
        }

        Horario horario = (Horario) otro;

        return horario.hora == hora && horario.minutos == minutos;
    }

}
