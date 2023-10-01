package aed;

import java.util.*;

public class ListaEnlazada<T> implements Secuencia<T> {
    // Completar atributos privados
    private Nodo primero;
    private Nodo ultimo;
    private int longitud;

    private class Nodo {
        private T valor;
        private Nodo siguiente;
        private Nodo anterior;

        Nodo(T valor) {this.valor = valor;}
    }

    public ListaEnlazada() {
        longitud = 0;
        primero = null;
        ultimo = null;
    }

    public int longitud() {
        return this.longitud;
    }

    public void agregarAdelante(T elem) {
        this.longitud++;
        if(primero == null) {
            primero = new Nodo(elem);
            ultimo = primero;
        }
        else {
            Nodo nuevo = new Nodo(elem);
            nuevo.siguiente = primero;
            primero.anterior = nuevo;
            this.primero = nuevo;
            
        }
    }

    public void agregarAtras(T elem) {
        this.longitud++;
        if(primero == null) {
            primero = new Nodo(elem);
            ultimo = primero;
        }
        else {
            Nodo actual = primero;
            while(actual.siguiente != null) {
                actual = actual.siguiente;
            }
            // la variable actual es ahora el ultimo nodo
            actual.siguiente = new Nodo(elem);
            actual.siguiente.anterior = actual;
            this.ultimo = actual.siguiente;
        }
    }

    public T obtener(int i) {
        if(i == 0) {
            return primero.valor;
        }
        else {
            Nodo actual = this.primero;
            for(int j = 0; j != i; j++) {
                actual = actual.siguiente;
            }
            return actual.valor;
        }
    }

    public void eliminar(int i) {
        if(this.longitud == 0 || this.longitud == 1) {
            this.longitud = 0;
            return;
        }
        else {
            longitud--;}
            if (i == 0) {
            //eliminar el primero
                this.primero.siguiente.anterior = null;
                this.primero = this.primero.siguiente;
            }
            else if (i == longitud) {
            // eliminar el ultimo
                this.ultimo = this.ultimo.anterior;
                this.ultimo.siguiente = null;
            }
            else {
            // eliminar algo del medio
                Nodo actual = this.primero;
                for(int j = 0; j != i; j++) {
                    actual = actual.siguiente;
                }
                actual.anterior.siguiente = actual.siguiente;
                actual.siguiente.anterior = actual.anterior; 
            }
        }
        
    

    public void modificarPosicion(int indice, T elem) {
        Nodo actual = this.primero;
        for(int j = 0; j != indice; j++) {
            actual = actual.siguiente;
        }
        actual.valor = elem;


    }

    public ListaEnlazada<T> copiar() {
        ListaEnlazada<T> copia = new ListaEnlazada<>();
        if(this.primero == null) {
            return copia;   
        }

        Nodo actual = primero;
        while(actual != null) {
            copia.agregarAtras(actual.valor);
            actual = actual.siguiente;
                
        }

        return copia;
    }

    public ListaEnlazada(ListaEnlazada<T> lista) {
        if(lista.primero == null) {
            this.primero = null;
            this.ultimo = null;
            this.longitud = 0;   
        }

        Nodo actual = lista.primero;
        this.primero = new Nodo(actual.valor);
        this.longitud = 1;
        actual = lista.primero.siguiente;
        while(actual != null) {
            this.agregarAtras(actual.valor);
            actual = actual.siguiente;
                
        }
    }
    
    @Override
    public String toString() {
        if(this.primero == null) {
            return "";
        }

        String valores = "[";
        Nodo actual = this.primero;
        while(actual != null) {
            valores = valores + actual.valor.toString() + ", ";
            actual = actual.siguiente;
        }
        valores = valores.subSequence(0, valores.length() -2).toString();
        valores = valores + "]";
        return valores;
    }

    private class ListaIterador implements Iterador<T> {
    	int iterador;

        public boolean haySiguiente() {
            return iterador != longitud - 1;
        }
        
        public boolean hayAnterior() {
            return iterador > -1;
        }

        public T siguiente() {
            if(haySiguiente()) {
                iterador++;
                return obtener(iterador);
                
            }
            return obtener(iterador);

        }
        

        public T anterior() {
            if(hayAnterior()) {
                T valor = obtener(iterador);
                iterador--;
                return valor;
            }
            if(iterador == -1) {
                return obtener(0);
            }
            return obtener(iterador);
        }
    }

    public Iterador<T> iterador() {
        ListaIterador iterador = new ListaIterador();
        iterador.iterador = -1;
	    return iterador;
    }

}
