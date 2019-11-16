package View;

import Manager.Play;
import Model.Classificació;
import Model.Resulta;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Menu menu = new Menu();
    List<Resulta> result = new ArrayList<>();
    Play play = new Play();
    public void start(){

        int opcion = menu.menu();

        switch (opcion){
            case 1:
                result.addAll((play.play()));
                start();
                break;
            case 2:
                new ConfiguracióCompetició().confi();
                break;
            case 3:
                for (Resulta resulta : result){
                    System.out.println(resulta.getCampionat());
                    for (Classificació classificació : resulta.getList()){
                        System.out.println(classificació.getNom()+" "+classificació.getTime()+" "+classificació.getPunt());
                    }

                }
                start();
                break;
            case 4:
                break;
            default:
                System.out.println("error opcion");
                start();
        }

    }
}
