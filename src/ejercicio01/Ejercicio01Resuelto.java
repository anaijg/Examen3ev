package ejercicio01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ejercicio01Resuelto {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Yo, robot", "Isaac Asimov", TipoLibro.FICCIÓN, 1950);
        Libro libro2 = new Libro("¿Sueñan los androides con ovejas eléctricas?", "Philip K. Dick", TipoLibro.FICCIÓN, 1968);
        Libro libro3 = new Libro("Piensa en Java", "Bruce Eckel", TipoLibro.NO_FICCIÓN, 1998);
        Libro libro4 = new Libro("Clean Code", "Robert C Martin", TipoLibro.NO_FICCIÓN, 2008);
        Libro libro5 = new Libro("El libro negro del programador", "Rafael Gómez Blanes", TipoLibro.NO_FICCIÓN, 2014);
        Libro libro6 = new Libro("El nombre de la rosa", "Umberto Eco", TipoLibro.FICCIÓN, 1980);
        Libro libro7 = new Libro("Watchmen", "Alan Moore y Dave Gibbons", TipoLibro.FICCIÓN, 1986);
        Libro libro8 = new Libro("Sandman", "Neil Gaiman", TipoLibro.FICCIÓN, 1989);
        Libro libro9 = new Libro("The Pragmatic Programmer", "Andrew Hunt y David Thomas", TipoLibro.NO_FICCIÓN, 1999);
        Libro libro10 = new Libro("The Art of Computer Programming, vol 1", "Donald Knuth", TipoLibro.NO_FICCIÓN, 1968);
        Libro libro11 = new Libro("The Art of Computer Programming, vol 2", "Donald Knuth", TipoLibro.NO_FICCIÓN, 1968);
        Libro libro12 = new Libro("The Art of Computer Programming, vol 3", "Donald Knuth", TipoLibro.NO_FICCIÓN, 1968);
        Libro libro13 = new Libro("The Art of Computer Programming, vol 4", "Donald Knuth", TipoLibro.NO_FICCIÓN, 1968);
        Libro libro14 = new Libro("The Art of Computer Programming, vol 5", "Donald Knuth", TipoLibro.NO_FICCIÓN, 1968);
        Libro libro15 = new Libro("The Art of Computer Programming, vol 6", "Donald Knuth", TipoLibro.NO_FICCIÓN, 1968);
        Libro libro16 = new Libro("The Art of Computer Programming, vol 7", "Donald Knuth", TipoLibro.NO_FICCIÓN, 1968);

        // 1. Crea un conjunto con los libros proporcionados y utiliza un iterador para mostrar los datos de los libros que contiene.
        System.out.println("1. Títulos de los libros");
        Set<Libro> libros = new HashSet<>();
        Libro[] l = {libro1, libro2, libro3, libro4, libro5, libro6, libro7, libro8, libro9, libro10,
                libro11, libro12, libro13, libro14, libro15, libro16};
        libros.addAll(Arrays.stream(l).toList());

        Iterator iterator = libros.iterator();
        while (iterator.hasNext()) {
            Libro libro = (Libro) iterator.next();
            System.out.println(libro.getTítulo());
        }

        // 2. Ordena los libros por título
        System.out.println("\n2. Títulos ordenados ");
        libros.stream()
                .sorted((l1, l2) -> l1.getTítulo().compareTo(l2.getTítulo()))
                .forEach(libro -> System.out.println(libro.getTítulo()));

        // 3. Muestra los libros de no ficción, ordenados por código de forma descendente.
        System.out.println("\n3. Libros de ficción ordenados por código (descendente)");
        libros.stream()
                .filter(libro -> libro.getTipo().equals(TipoLibro.FICCIÓN))
                .sorted((l1, l2) -> l2.getCódigo() - l1.getCódigo())
                .forEach(libro -> System.out.println(libro));

        // Crea un fichero catálogo.csv, que se guarde en la misma carpeta que el paquete ejercicio02, que contenga una línea por cada libro, con los campos (valores de los atributos) título, autor y tipo separados por “;” (punto y coma).
        // las excepciones deben personalizarse mediante mensajes que indiquen el tipo de problema que las ha lanzado. Además de la excepción obligada de entrada/salida, añade la posiblidad de que salte una excepción genérica, en la que no hayamos pensado.
        System.out.println("\n4. Creación de un fichero que contenga una línea por líbro, y los datos de cada libro separados por ;");
        String ruta = "src\\ejercicio01\\catalogo.csv";
        File file = new File(ruta);
        FileWriter escritor = null;
        try {
            escritor = new FileWriter(file, true);
            for (Libro libro: libros) {
                String autor = libro.getAutor();
                int año = libro.getañoPublicación();
                String título = libro.getTítulo();
                String linea = título + ";" + autor + ";" + año + "\n";
                escritor.write(linea);
            }
        } catch (IOException ioe) {
            //throw new RuntimeException(e);
            System.out.println("Problema al escribir en el fichero.");
        } catch (Exception e) {
            System.out.println("Esta excepción no la vi venir.");
        } finally {
            try {
                escritor.close();
            } catch (IOException e) {
                //throw new RuntimeException(e);
                System.out.println("Problema al cerrar el fichero.");
            }
        }


    }


}
