package Manager;

import Model.Campionat;
import Model.Classificació;
import Model.Jugador;
import Model.Vehicle;
import View.Menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Play {
    Vehicle vehicle = new Vehicle();
    Campionat campionat = new Campionat();
    Circuit c = new Circuit();
    List<Classificació> listtimeC = new ArrayList<>();
    int circuit;
    int participant;

    public void play(){
        vehicle.setTipo(new Menu().trialvehicle());
        circuit= campionat.getQtatdecircuitsdelcampionat();
        participant= campionat.getQtatdeparticipants();
        for (int i = 0; i < circuit; i++) {
            System.out.println("Circuit "+(i+1));
            c.star(participant);
        }
        System.out.println("resulta final: ");
        listtimeC = c.getListtimeC();
        Collections.sort(listtimeC);
        System.out.println(listtimeC);


    }
}
