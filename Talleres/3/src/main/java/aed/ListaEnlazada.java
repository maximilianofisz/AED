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
        if(this.longitud == 0) {
            return;
        }
        else {
            longitud--;}
            if (i == 0 && this.primero.siguiente != null) {
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
                for(int j = 0; j != 1; j++) {
                    actual = actual.siguiente;
                }

                if (actual.siguiente != null) {
                    actual.anterior.siguiente = actual.siguiente;
                }

                if(actual.anterior != null) {
                    actual.siguiente.anterior = actual.anterior; 
                }
                
            }
        }
        
    

    public void modificarPosicion(int indice, T elem) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public ListaEnlazada<T> copiar() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public ListaEnlazada(ListaEnlazada<T> lista) {
        throw new UnsupportedOperationException("No implementada aun");
    }
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    private class ListaIterador implements Iterador<T> {
    	// Completar atributos privados

        public boolean haySiguiente() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
        
        public boolean hayAnterior() {
	        throw new UnsupportedOperationException("No implementada aun");
        }

        public T siguiente() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
        

        public T anterior() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
    }

    public Iterador<T> iterador() {
	    throw new UnsupportedOperationException("No implementada aun");
    }

}
