
import Model.Campionat;
import Model.Jugador;
import View.Game;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Jugador jugador = new Jugador();
        Campionat campionat = new Campionat();
        Scanner sr = new Scanner(System.in);

        System.out.print("Nom de jugador: ");
        jugador.setNomjugador( new Scanner(System.in).nextLine());
        System.out.print("qtat de participants: ");
        campionat.setQtatdeparticipants(sr.nextInt());
        System.out.print("qtat de circuits del campionat: ");
        campionat.setQtatdecircuitsdelcampionat(sr.nextInt());
        Game game = new Game();
        game.start();
    }
}
