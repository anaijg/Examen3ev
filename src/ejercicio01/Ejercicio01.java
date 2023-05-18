package ejercicio01;

public class Ejercicio01 {
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


        // 2. Ordena los libros por título
        System.out.println("\n2. Títulos ordenados ");

        // 3. Muestra los libros de no ficción, ordenados por código de forma descendente.
        System.out.println("\n3. Libros de ficción ordenados por código (descendente)");

        // 4. Crea un fichero catálogo.csv, que se guarde en la misma carpeta que el paquete ejercicio02, que contenga una línea por cada libro, con los campos (valores de los atributos) título, autor y tipo separados por “;” (punto y coma).
        // 5. las excepciones deben personalizarse mediante mensajes que indiquen el tipo de problema que las ha lanzado. Además de la excepción obligada de entrada/salida, añade la posiblidad de que salte una excepción genérica, en la que no hayamos pensado.


    }
}
