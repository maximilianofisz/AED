package aed;

public class Fecha {
    public int dia;
    public int mes;

    public Fecha(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public Fecha(Fecha fecha) {
        this.dia = fecha.dia();
        this.mes = fecha.mes();
    }

    public Integer dia() {
        return dia;
    }

    public Integer mes() {
        return mes;
    }

    public String toString() {
        return dia + "/" + mes;
    }

    @Override
    public boolean equals(Object otra) {
        boolean oen = (otra == null);

        boolean cd = otra.getClass() != this.getClass();

        if (oen || cd) {
            return false;
        }

        Fecha fecha = (Fecha) otra;

        return fecha.dia == dia && fecha.mes == mes;
    }

    public void incrementarDia() {
        if(diasEnMes(mes) == dia) {
            dia = 1;
            if(mes == 12) {
                mes = 1;
            }
            else {
                mes++;
            }
            
        }
        else {
            dia++;
        }

    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
