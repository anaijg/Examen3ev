package ejercicio02;

public class CodigoPostal {
    String codigoPostal;
    String idMunicipio;
    String nombreMunicipio;

    public CodigoPostal(String codigoPostal, String idMunicipio, String nombreMunicipio) {
        this.codigoPostal = codigoPostal;
        this.idMunicipio = idMunicipio;
        this.nombreMunicipio = nombreMunicipio;
    }

    @Override
    public String toString() {
        return codigoPostal + "\t" + nombreMunicipio;
    }
}
