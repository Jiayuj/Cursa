package Manager;

import Model.Campionat;
import Model.Jugador;
import Model.Vehicle;
import View.Menu;

public class Play {
    Vehicle vehicle = new Vehicle();
    Campionat campionat = new Campionat();
    int circuit;
    int participant;



    public void play(){
        vehicle.setTipo(new Menu().trialvehicle());
        circuit= campionat.getQtatdecircuitsdelcampionat();
        participant= campionat.getQtatdeparticipants();
        for (int i = 0; i < circuit; i++) {
            System.out.println("Circuit "+(i+1));
            new Circuit().star(participant,new Jugador().getNomjugador());
        }


    }
}
