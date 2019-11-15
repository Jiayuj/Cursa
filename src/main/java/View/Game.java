package View;

import Manager.Play;
import Model.Classificació;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Menu menu = new Menu();
    List<Classificació> result = new ArrayList<>();

    public void start(){

        int opcion = menu.menu();

        switch (opcion){
            case 1:
                result.add((Classificació) new Play().play());
                start();
                break;
            case 2:
                new ConfiguracióCompetició().confi();
                break;
            case 3:
                System.out.println(result);
                break;
            case 4:

                break;
            default:
                System.out.println("error opcion");
                start();
        }

    }
}
