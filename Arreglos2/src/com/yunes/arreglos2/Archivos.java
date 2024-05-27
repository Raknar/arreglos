package com.yunes.arreglos2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {
    public void crearArchivo(String str) throws IOException {
        File archivo = new File("archivo.txt");
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(archivo));
            String[] arreglo = {"uno", "dos"};
            for (int i = 0; i < arreglo.length; i++)
                bw.write("Hola mundo en mi primer archivo: ");
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
    }


    public void arreglarContenidoDesdeArreglo() {
    }
    public void escribirArchivos2() throws IOException {
        com.yunes.Arreglos2.Arreglos2 arreglos = new com.yunes.Arreglos2.Arreglos2();
        // esribir estructura para escribir el archivo

        arreglos.copiarOtroArreglo();


        File archivo = new File("arreglo.txt");
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(archivo));
            String[] arreglo = {"uno", "dos"};
            for (int i = 0; i < arreglo.length; i++)
                bw.write("Hola mundo en mi primer archivo: ");
        } finally {
            if (bw != null) {
                bw.close();
            }
        }



    }
}