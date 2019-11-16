package View;

import Model.Campionat;
import Model.Jugador;
import View.Menu;

import java.util.Scanner;

public class ConfiguracióCompetició {
    Jugador jugador = new Jugador();
    Campionat campionat = new Campionat();

    void confi(){
        Scanner sr = new Scanner(System.in);
        int opcion = new Menu().menuconfiguracion();
        switch (opcion){
            case 1:
                System.out.print("Nom de jugador: ");
                jugador.setNomjugador( sr.nextLine());
                break;
            case 2:
                System.out.print("qtat de participants: ");
                campionat.setQtatdeparticipants(sr.nextInt());
                break;
            case 3:
                System.out.print("qtat de circuits del campionat: ");
                campionat.setQtatdecircuitsdelcampionat(sr.nextInt());
                break;
            case 4:
                new Game().start();
                break;
            default:
                System.out.println("error opcion");
                confi();
        }
        new Game().start();
    }

}
