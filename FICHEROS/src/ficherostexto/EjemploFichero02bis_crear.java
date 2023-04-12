package ficherostexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFichero02bis_crear {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\prueba\\cliente.txt"));
            bw.write("Alberto\n");
            bw.write("Eva\n");
            bw.write("Laura\n");
            bw.write("Antonio\n");
            System.out.println("Fichero creado");
            bw.close();
        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }
}
