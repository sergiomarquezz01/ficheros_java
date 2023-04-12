package ficherostexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;




public class EjemploFichero03_leer {
	public static void main(String[]args)
	{
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("c:\\prueba\\asignatura.txt"));
			String linea="";
			while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
			br.close();
		}catch (IOException ioe) {
            System.out.println("No se ha podido leer el fichero");
        }
	}
}
