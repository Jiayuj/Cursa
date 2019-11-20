package View;

import Manager.Play;
import Model.Classificació;
import Model.Resulta;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Game {
    Menu menu = new Menu();
    static List<Resulta> result = new ArrayList<>();

    public void start(){

        int opcion = menu.menu();

        switch (opcion){
            case 1:
                Play play = new Play();
                List<Classificació> list = play.play();
                result.add(new Resulta("Campionat "+play.tipo()+" "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")), list));
                start();
                break;
            case 2:
                new ConfiguracióCompetició().confi();
                break;
            case 3:
                for (Resulta resulta : result){
                    System.out.println(resulta.getCampionat());
                    for (Classificació classificació : resulta.getList()){
                        System.out.format("Nom: %10s  Tiempo: %.2f  Punto: %d \n",classificació.getNom(),classificació.getTime(),classificació.getPunt());
                    }

                }
                start();
                break;
            case 4:
                System.out.println("bye");
                System.exit(0);
                break;
            default:
                System.out.println("error opcion");
                start();
        }

    }
}
