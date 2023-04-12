package ficherostexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Ej2
 * @author Hp EliteDesk
 *
 */

public class EjemploFichero02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedWriter bw=new BufferedWriter(new FileWriter("c:\\prueba\\fruta.txt"));
			//no añade,pisa el fichero con los datos que se metan si se ejecuta de nuevo
			
			bw.write("naranja\n");
			bw.write("fresa\n");
			bw.write("mango\n");
			bw.write("platano\n");
			System.out.println("Fichero creado");
			bw.close();
		}catch(IOException ioe)
		{
			System.out.println("No se ha podido escribir en el fichero");
		}

	}

}
