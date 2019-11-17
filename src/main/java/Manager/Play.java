package Manager;

import Model.Campionat;
import Model.Classificació;
import Model.Resulta;
import Model.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Play {
    Vehicle vehicle = new Vehicle();
    Campionat campionat = new Campionat();
    Circuit c = new Circuit();
    String tipo;

    public List<Classificació> play() {
        List<Classificació> listtimeC;

        tipo = vehicle.setTipo();
        System.out.println("Welcome championship " + tipo);

        for (int i = 0; i < campionat.getQtatdecircuitsdelcampionat(); i++) {
            System.out.println("Circuit " + (i + 1));
            c.star(campionat.getQtatdeparticipants(), vehicle.getVelocidadMax(), vehicle.getVelocidadMin());
        }
        listtimeC = c.getListtimeC();

        return listtimeC;
    }
    public String tipo(){
        return tipo;
    }
}
