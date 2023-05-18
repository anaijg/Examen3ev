package ejercicio02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        String ruta = "src\\ejercicio02\\codigos_postales_municipios.csv";
        File file = new File(ruta);
        Scanner lector = null;
        List<CodigoPostal> codigosPostales = new ArrayList<>();
        try {
            lector = new Scanner(file);
            lector.nextLine(); // nos saltamos los encabezados
            while (lector.hasNext()) {
                String linea = lector.nextLine();
                String[] campos = linea.split(",");
                // 7. mostramos el contenido del fichero, línea a línea, de forma tabulada, sin mostrar los encabezados
                //System.out.println(campos[0] + "\t" + campos[1] + "\t" + campos[2]);
                // 8. Para cada línea del fichero creamos un objeto y lo guardamos en una lista,
                String cp = campos[0];
                String idMunicipio = campos[1];
                String nombreMunicipio = campos[2];
                CodigoPostal codigoPostal = new CodigoPostal(cp, idMunicipio, nombreMunicipio);
                codigosPostales.add(codigoPostal);
            }
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("No se ha podido acceder al fichero.");
        } finally {
            lector.close();
        }

        // 8. Muestra los códigos postales de Melilla
        codigosPostales.stream()
                .filter(cod -> cod.codigoPostal.startsWith("52"))
                .forEach(System.out::println);

        // 9. Cuenta los códigos postales de Melilla
        long melilla = codigosPostales.stream()
                .filter(cod -> cod.codigoPostal.startsWith("52"))
                .map(cod -> cod.codigoPostal)
                .count();
        System.out.println(melilla);
    }
}
