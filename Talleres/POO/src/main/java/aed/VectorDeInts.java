package aed;

class VectorDeInts implements SecuenciaDeInts {
    private static final int CAPACIDAD_INICIAL = 1;
    public int[] elementos;

    public VectorDeInts() {
        elementos = new int[0];
    }

    public VectorDeInts(VectorDeInts vector) {
        elementos = new int[vector.elementos.length];
        for(int i = 0; i < elementos.length; i++) {
            elementos[i] = vector.elementos[i];
        }
    }

    public int longitud() {
        return elementos.length;
    }

    public void agregarAtras(int i) {
        int[] elementosModificado = new int[elementos.length + 1];
        for (int j = 0; j < elementos.length; j++) {
            elementosModificado[j] = elementos[j];
        }
        elementosModificado[elementosModificado.length - 1] = i;
        elementos = elementosModificado;
    }

    public int obtener(int i) {
        return elementos[i];
    }

    public void quitarAtras() {
        int[] elementosModificado = new int[elementos.length - 1];
        for (int j = 0; j < elementos.length - 1; j++) {
            elementosModificado[j] = elementos[j];
        }
        elementos = elementosModificado;
    }

    public void modificarPosicion(int indice, int valor) {
        elementos[indice] = valor;
    }

    public VectorDeInts copiar() {
        VectorDeInts nuevoVector = new VectorDeInts();
        nuevoVector.elementos = new int[elementos.length];
        for(int i = 0; i < elementos.length; i++) {
            nuevoVector.elementos[i] = elementos[i];
        }
        return nuevoVector;
    }

}
