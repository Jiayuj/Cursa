package datos;

import java.util.List;

public class Jugadores {

    List<String> jugador;
    private String nom;
    private int qtatparticipants;
    private int qtacircuitscampionat;

    public Jugadores(String nom, int qtatparticipants, int qtacircuitscampionat) {
        this.nom = nom;
        this.qtatparticipants = qtatparticipants;
        this.qtacircuitscampionat = qtacircuitscampionat;
        jugador.add(nom,String.valueOf(qtatparticipants),String.valueOf(qtacircuitscampionat));

    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQtatparticipants() {
        return qtatparticipants;
    }

    public void setQtatparticipants(int qtatparticipants) {
        this.qtatparticipants = qtatparticipants;
    }

    public int getQtacircuitscampionat() {
        return qtacircuitscampionat;
    }

    public void setQtacircuitscampionat(int qtacircuitscampionat) {
        this.qtacircuitscampionat = qtacircuitscampionat;
    }
}
