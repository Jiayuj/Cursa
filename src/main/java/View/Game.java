package View;

import Manager.Play;
import Model.Campionat;
import Model.Jugador;

import java.util.Scanner;

public class Game {
    Menu menu = new Menu();
    Scanner sr = new Scanner(System.in);
    Campionat campionat = new Campionat();
    Jugador jugador = new Jugador();

    public void start(){
        System.out.print("Nom de jugador: ");
        jugador.setNomjugador(sr.nextLine());
        System.out.print("qtat de participants: ");
        campionat.setQtatdeparticipants(sr.nextInt());
        System.out.print("qtat de circuits del campionat: ");
        campionat.setQtatdecircuitsdelcampionat(sr.nextInt());

        int opcion = menu.menu();

        switch (opcion){
            case 1:
                new Play().play();

                break;
            case 2:
                new ConfiguracióCompetició().confi();
                break;
            case 3:

                break;
            case 4:

                break;
            default:
                System.out.println("error opcion");
        }

    }
}
