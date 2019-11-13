package Manager;

import Model.Classificació;
import Model.Jugador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Circuit {

    List<Classificació> listtime = new ArrayList<>();
    List<Classificació> listtimeC = new ArrayList<>();
    Random random = new Random();


    public void star(int quatitatparticipants){
        listtime.add(new Classificació(new Jugador().getNomjugador(),random.nextDouble()*(14.99 - 12.99)+12.99,0));
        for (int i = 1; i <quatitatparticipants ; i++) {
            listtime.add(new Classificació("Jugador"+(i+1),random.nextDouble()*(14.99 - 12.99)+12.99,0));
        }
        Collections.sort(listtime);
        int punt = 10;
        int i = 0;
        for (Classificació c : listtime){
            if (listtimeC.size()==quatitatparticipants){
                for (int j = 0; j < listtimeC.size() ; j++) {
                    if (listtimeC.get(j).getNom().equals(c.getNom()) ){
                        int spunt = listtimeC.get(j).getPunt();
                        spunt += punt;
                        c.setPunt(spunt);
                        listtime.set(i,c);
                        listtimeC.set(j,c);
                    }
                }
            }else {
                int spunt = c.getPunt();
                spunt += punt;
                c.setPunt(spunt);
                listtimeC.add(i,c);
            }
            punt-=2;
            i++;
        }
        System.out.println(listtime);
        listtime.clear();
        System.out.println(listtimeC);


    }

}
