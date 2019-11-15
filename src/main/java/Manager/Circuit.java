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


    public void star(int quatitatparticipants,double max, double min){
        listtime.add(new Classificació(new Jugador().getNomjugador(),random.nextDouble()*(max - min)+min,0));
        for (int i = 1; i <quatitatparticipants ; i++) {
            listtime.add(new Classificació("Jugador"+(i+1),random.nextDouble()*(max - min)+min,0));
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
                        double stime = listtimeC.get(j).getTime();
                        double time = c.getTime();
                        stime += time;
                        listtimeC.set(j,new Classificació(c.getNom(),stime,spunt));
                    }
                }
            }else {
                int spunt = c.getPunt();
                spunt += punt;
                c.setPunt(spunt);
                listtimeC.add(i,c);
            }
            if (punt != 0){
                punt-=2;
            }
            i++;
        }
        System.out.println(listtime);
        listtime.clear();
    }

    public List<Classificació> getListtimeC() {
        return listtimeC;
    }
}
