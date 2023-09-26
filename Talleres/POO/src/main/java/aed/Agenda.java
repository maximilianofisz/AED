package aed;

import java.util.Vector;

public class Agenda {
    public Fecha fechaActual;
    public Recordatorio[] recordatorios;

    public Agenda(Fecha fechaActual) {
        this.fechaActual = new Fecha(fechaActual);
        this.recordatorios = new Recordatorio[0];
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        Recordatorio[] nuevosRecordatorios = new Recordatorio[recordatorios.length + 1];
        for (int j = 0; j < recordatorios.length; j++) {
            nuevosRecordatorios[j] = recordatorios[j];
        }
        nuevosRecordatorios[nuevosRecordatorios.length-1] = recordatorio;
        recordatorios = nuevosRecordatorios;

    }

    @Override
    public String toString() {
        String detalle = "";
        
        for(int i = 0; i < recordatorios.length; i++) {
            if(recordatorios[i].fecha.equals(fechaActual)) {
                detalle = detalle + recordatorios[i].toString() + "\n";
            }
        }

        return fechaActual + "\n" + "=====\n" + detalle;
    }

    public void incrementarDia() {
        Fecha nuevaFecha = fechaActual;
        nuevaFecha.incrementarDia();
        fechaActual = nuevaFecha;

    }

    public Fecha fechaActual() {
        return new Fecha(fechaActual);
    }

}
