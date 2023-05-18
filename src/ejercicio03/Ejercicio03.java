package ejercicio03;

import java.time.LocalDate;
import java.util.HashMap;

public class Ejercicio03 {
    public static void main(String[] args) {
        Corredor corredor1 = new Corredor("12345678D", LocalDate.of(2005, 05, 16));
        Corredor corredor2 = new Corredor("87654321A", LocalDate.of(2000, 10, 6));
        Corredor corredor3 = new Corredor("23456789D", LocalDate.of(2004, 1, 1));
        Corredor corredor4 = new Corredor("98765432B", LocalDate.of(2001, 8, 20));
        Corredor corredor5 = new Corredor("34567890C", LocalDate.of(2004, 1, 1));
        Corredor corredor6 = new Corredor("76543210B", LocalDate.of(2006, 7, 14));

        // crear una carrera
        Carrera carrera = new Carrera("10k de Carabanchel", LocalDate.of(2023, 06, 10),"09:30", "Madrid", Distancia.DIEZ_K);

        // inscribir a los corredores
        carrera.inscribirCorredor(corredor1);
        carrera.inscribirCorredor(corredor2);
        carrera.inscribirCorredor(corredor3);
        carrera.inscribirCorredor(corredor4);
        carrera.inscribirCorredor(corredor5);
        carrera.inscribirCorredor(corredor6);

        // competir
        carrera.competir();

        // elaborar clasificación
        HashMap<Integer, Corredor> clasificación = carrera.elaborarClasificación();

        // imprimir la clasificación
        carrera.imprimirClasificación(clasificación);
        System.out.println();

        // imprimirPodium()
        carrera.publicarPodium(clasificación);
    }
}
