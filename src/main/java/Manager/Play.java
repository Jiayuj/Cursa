package Manager;

import Model.Campionat;
import Model.Classificació;
import Model.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Play {
    Vehicle vehicle = new Vehicle();
    Campionat campionat = new Campionat();
    Circuit c = new Circuit();
    List<Classificació> result = new ArrayList<>();
    List<Classificació> listtimeC = new ArrayList<>();


    public List<Classificació> play() {
        String tipo = vehicle.setTipo();
        System.out.println("Welcome championship " + tipo);

        for (int i = 0; i < campionat.getQtatdecircuitsdelcampionat(); i++) {
            System.out.println("Circuit " + (i + 1));
            c.star(campionat.getQtatdeparticipants(), vehicle.getVelocidadMax(), vehicle.getVelocidadMin());
        }
        System.out.println("resulta final: ");
        listtimeC = c.getListtimeC();
        Collections.sort(listtimeC);
        System.out.println(listtimeC);

        for (Classificació c : listtimeC) {
            result.add(new Classificació(c.getNom(), c.getTime(), c.getPunt()));
        }
        return result;
    }
}
