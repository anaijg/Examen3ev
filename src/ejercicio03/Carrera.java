package ejercicio03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Carrera implements Participación{
    String nombre;
    LocalDate fecha;
    String hora;
    String lugar;
    Distancia distancia;
    ArrayList<Corredor> corredores;
    static int inscripciones;

    public Carrera(String nombre, LocalDate fecha, String hora, String lugar, Distancia distancia) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.distancia = distancia;
        corredores = new ArrayList<>();
    }


    @Override
    public void competir() {
        int max = 0, min = 0;
        switch (distancia) {
            case CINCO_K:
                max = 60;
                min = 15;
                break;
            case DIEZ_K:
                max = 90;
                min = 30;
                break;
            case MEDIA_MARATÓN:
                max = 150;
                min = 60;
                break;
            case MARATÓN:
                max = 90;
                min = 30;
                break;
        }
        for (Corredor participante: corredores) {
            participante.setTiempo((int) (Math.random() * (max - min + 1) + min));
        }

    }

    @Override
    public HashMap<Integer, Corredor> elaborarClasificación() {
        // competir
        competir();
        // inicializamos el mapa
        HashMap<Integer, Corredor> clasificación = new HashMap<>();
        // ordenamos los corredores
        corredores.sort((c1, c2) -> c1.getTiempo() - c2.getTiempo());
        // rellenamos el mapa
        for (int i = 0; i < corredores.size(); i++) {
            clasificación.put((i + 1), corredores.get(i));
        }

        return clasificación;
    }

    public void imprimirClasificación(HashMap<Integer, Corredor> clasificación) {
        // imprimimos la clasificación
        System.out.println("\n***** CLASIFICACIÓN *****");
        for (Map.Entry<Integer, Corredor> entrada: clasificación.entrySet()) {
            System.out.println("Puesto " + entrada.getKey() + " - " + entrada.getValue());
        }
    }

    @Override
    public void publicarPodium(HashMap<Integer, Corredor> clasificación) {
        System.out.println("*****  PODIUM *****  ");
        System.out.println("ORO:\t\t" + clasificación.get(1));
        System.out.println("PLATA:\t\t" + clasificación.get(2));
        System.out.println("BRONCE:\t\t" + clasificación.get(3));
    }

    @Override
    public void inscribirCorredor(Corredor corredor) {
        corredores.add(corredor);
        inscripciones++;
        corredor.setDorsal(inscripciones);
    }
}
