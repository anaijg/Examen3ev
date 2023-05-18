package ejercicio01;


/**
 * @author Ana
 */

public class Libro {
    private String título;
    private String autor;
    private TipoLibro tipo;
    private int código;
    private int añoPublicación;
    public static int id;

    public Libro(String título, String autor, TipoLibro tipo, int añoPublicación) {
        this.título = título;
        this.autor = autor;
        this.tipo = tipo;
        this.añoPublicación = añoPublicación;
        id++;
        código = id;
    }

    public String getTítulo() {
        return título;
    }

    public String getAutor() {
        return autor;
    }
    public TipoLibro getTipo() {
        return tipo;
    }

    public int getCódigo() {
        return código;
    }

    public int getañoPublicación() {
        return añoPublicación;
    }

    @Override
    public String toString() {
        String ficcion = "";
        if (tipo.equals(TipoLibro.FICCIÓN)) {
            ficcion = "Ficción";
        } else {
            ficcion = "No ficción";
        }
        return "Libro (código): " + código +
                "\n  Autor: " + autor +
                "\n  Tipo: " + ficcion +
                "\n  Título: " + título +
                "\n  Año de Publicación : " + añoPublicación + "\n";
    }
}
