package aed;

public class Recordatorio {

    public Fecha fecha;
    public Horario horario;
    public String mensaje;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.fecha = new Fecha(fecha);
        this.horario = new Horario(horario.hora, horario.minutos);
        this.mensaje = mensaje;
    }

    public Horario horario() {
        return new Horario(horario.hora(), horario.minutos());
    }

    public Fecha fecha() {
        return new Fecha(fecha);
    }

    public String mensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return mensaje + " @ " + fecha + " " + horario;
    }

}
