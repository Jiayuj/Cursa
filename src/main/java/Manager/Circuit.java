package Manager;

import Model.Classificació;
import Model.Jugador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Circuit {


    public void star(int quatitatparticipants, String nom){
        Random random = new Random();
        List<Classificació> listtime = new ArrayList<>();
        listtime.add(new Classificació(new Jugador().getNomjugador(),random.nextDouble()*(14.99 - 12.99)+12.99,0));
        for (int i = 1; i <quatitatparticipants ; i++) {
            listtime.add(new Classificació("Jugador"+(i+1),random.nextDouble()*(14.99 - 12.99)+12.99,0));
        }

        Collections.sort(listtime);
        int punt = 10;
        for (Classificació c : listtime){
            c.setPunt(punt);
            listtime.set(0,c);
            punt-=2;
        }
        System.out.println(listtime);


    }

}
