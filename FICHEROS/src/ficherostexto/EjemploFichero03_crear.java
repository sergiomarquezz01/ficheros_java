package ficherostexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class EjemploFichero03_crear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedWriter bw=new BufferedWriter(new FileWriter("c:\\prueba\\asignatura.txt"));
			bw.write("Pr\n");
			bw.write("LM\n");
			bw.write("SI\n");
			bw.write("BD\n");
			bw.write("ED\n");
			bw.write("FOL\n");
			System.out.println("Fichero creado");
			bw.close();
		}catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
        }

	}

}
