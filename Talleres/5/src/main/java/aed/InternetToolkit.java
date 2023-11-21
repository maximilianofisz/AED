package aed;

public class InternetToolkit {
    public InternetToolkit() {
        
    }

    public Fragment[] tcpReorder(Fragment[] fragments) {
        // IMPLEMENTAR
        int tamaño = fragments.length;

        for(int i = 0; i < tamaño - 1; i++) {
            // Vamos recorriendo y chequeando que esten bien ordenados
            // Si esta mal ordenado, compareTo devuelve 1
            // El siguiente fragmento esta en una posicion erronea

            if(fragments[i].compareTo(fragments[i+1]) > 0) {
                int j = i; 

                if(j==-1) {
                    Fragment trans = fragments[j+1];
                    fragments[j+1] = fragments[j];
                    fragments[j] = trans;
                }
                else {
                    while(fragments[j+1].compareTo(fragments[j]) == -1) {

                        Fragment trans = fragments[j+1];
                        fragments[j+1] = fragments[j];
                        fragments[j] = trans;

                        j--;
                        if(j == -1) {
                            break;
                        } 
                    }
                }
            }
        }

        return fragments;
    }

    















    public Router[] kTopRouters(Router[] routers, int k, int umbral) {
        // IMPLEMENTAR
        return null;
    }

    public IPv4Address[] sortIPv4(String[] ipv4) {
        // IMPLEMENTAR
        return null;
    }

}
