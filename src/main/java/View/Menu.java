package View;

import java.util.Scanner;

public class Menu {
    Scanner sr = new Scanner(System.in);
    int menu(){
        System.out.println("--------------------------------------------");
        System.out.println("1- Jugar");
        System.out.println("2- Configuració de la competició");
        System.out.println("3- Resultats/Palmarès/ClassificacióGeneral");
        System.out.println("4- Acabar");
        System.out.println("--------------------------------------------");
        return sr.nextInt();
    }
    public int menuconfiguracion(){
        System.out.println("--------------------------------------------");
        System.out.println("1- Nom de jugador");
        System.out.println("2- qtat de participants");
        System.out.println("3- qtat de circuits del campionat");
        System.out.println("4- Acabar");
        System.out.println("--------------------------------------------");
        return  sr.nextInt();
    }
    public String trialvehicle(){
        System.out.println("--------------------------------------------");
        System.out.println("1- bicicleta");
        System.out.println("2- cotxe");
        System.out.println("3- camió");
        System.out.println("4- moto");
        System.out.println("--------------------------------------------");
        String r="";
        int opcion = sr.nextInt();
        switch (opcion){
            case 1:
                r="bicicleta";
                break;
            case 2:
                r="cotxe";
                break;
            case 3:
                r="camió";
                break;
            case 4:
                r="moto";
                break;
        }
        return r;
    }
}
