package View;

import datos.Campionat;
import datos.Jugador;
import datos.Vehicle;

public class Play {
    Vehicle vehicle = new Vehicle();
    Campionat campionat = new Campionat();
    int circuit;
    int participant;



    void play(){
        vehicle.setTipo(new Menu().trialvehicle());
        circuit= campionat.getQtatdecircuitsdelcampionat();
        participant= campionat.getQtatdeparticipants();
        for (int i = 0; i < circuit; i++) {
            new Circuit().star(participant,new Jugador().getNom());
        }


    }
}
