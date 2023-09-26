package aed;

class VectorDeInts implements SecuenciaDeInts {
    private static final int CAPACIDAD_INICIAL = 1;
    public int[] elementos;

    public VectorDeInts() {
        elementos = new int[0];
    }

    public VectorDeInts(VectorDeInts vector) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public int longitud() {
        return elementos.length;
    }

    public void agregarAtras(int i) {
        int[] elementosModificado = new int[elementos.length + 1];
        for (int j : elementos) {
            elementosModificado[j] = elementos[j]
        }
        elementosModificado[elementosModificado.length - 1] = i;
        elementos = elementosModificado;
    }

    public int obtener(int i) {
        return elementos[i];
    }

    public void quitarAtras() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void modificarPosicion(int indice, int valor) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public VectorDeInts copiar() {
        throw new UnsupportedOperationException("No implementada aun");
    }

}
