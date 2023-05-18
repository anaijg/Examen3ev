package ejercicio03;

import java.util.HashMap;

public interface Participación {
    void competir();
    HashMap<Integer, Corredor> elaborarClasificación();
    void publicarPodium(HashMap<Integer, Corredor> clasificación);
    void inscribirCorredor(Corredor corredor);
}
