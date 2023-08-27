package aed;

import java.util.Scanner;
import java.io.PrintStream;

class Archivos {
    float[] leerVector(Scanner entrada, int largo) {
        float[] rsp = new float[largo];
        for(int i = 0; i < largo; i++) {
            float algo = entrada.nextFloat();
            rsp[i] = algo;
        }
        return rsp;
    }

    float[][] leerMatriz(Scanner entrada, int filas, int columnas) {
        float[][] matriz = new float[filas][columnas]; 
        for(int i = 0; i < filas; i++) {
            matriz[i] = leerVector(entrada, columnas);
        }
        return matriz;
    }

    void imprimirPiramide(PrintStream salida, int alto) {
        int ancho = alto - 1;
        int largoRenglon = 1;
        for(int i = 0; i < alto; i++) {
            largoRenglon = largoRenglon + 2;
        }
        int astericos = 1;
        for(int i = 0; i < alto; i++) {
            
            
            String linea = "";
            for(int j = 0; j < ancho; j++) {
                linea += " ";
            }
            for(int k = 0; k < astericos; k++) {
                linea += "*";
            }
            for(int j = 0; j < ancho; j++) {
                linea += " ";
            }
            astericos = astericos + 2;
            ancho = ancho - 1;
            salida.println(linea);
        }
    }
}
