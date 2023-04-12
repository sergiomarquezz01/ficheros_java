package ficherostexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFichero02bis_leer {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\prueba\\cliente.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (IOException ioe) {
            System.out.println("No se ha podido leer el fichero");
        }
    }
}