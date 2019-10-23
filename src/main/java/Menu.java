import java.util.Scanner;

public class Menu {
    Scanner sr = new Scanner(System.in);
    int menu(){
        System.out.println("--------------------------------------------");
        System.out.println("1- Configuració de la competició");
        System.out.println("2- Resultats/Palmarès/ClassificacióGeneral");
        System.out.println("3- Jugar");
        System.out.println("4- Acabar");
        System.out.println("--------------------------------------------");
        return sr.nextInt();
    }

    int menuconfiguracion(){
        System.out.println("--------------------------------------------");
        System.out.println("1- Nom de jugador");
        System.out.println("2- qtat de participants");
        System.out.println("3- qtat de circuits del campionat");
        System.out.println("4- Acabar");
        System.out.println("--------------------------------------------");
        return  sr.nextInt();
    }
}
