package com.yunes.Arreglos2;

import java.util.Arrays;

public class Arreglos2 {
    public void copiarArreglo() {
        // crear arreglo con datos enteros
        int[] arregloOriginal = {1, 13, 31, 150};
        int[] copia = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < copia.length; i++) {
            System.out.println("Elementos del nuevo arreglo: " + copia[i]);
        }
    }

    public void copiarOtroArreglo() {
        String[] palabras = {"Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno"};
        String[] copiaDePalabras = Arrays.copyOf(palabras, palabras.length);

        for (int i = 0; i < copiaDePalabras.length; i++) {
            System.out.print(copiaDePalabras[i].toUpperCase() + "\t\t");
        }
    }

    public static void main(String[] args) {
        Arreglos2 arreglos = new Arreglos2();
        System.out.println("Copiar arreglo de enteros:");
        arreglos.copiarArreglo();
        System.out.println("\n\nCopiar arreglo de palabras:");
        arreglos.copiarOtroArreglo();
    }
}
