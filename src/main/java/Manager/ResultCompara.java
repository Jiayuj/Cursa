package Manager;

import Model.Classificació;

import java.util.Comparator;

public class ResultCompara implements Comparator<Classificació> {

    @Override
    public int compare(Classificació o1, Classificació o2) {
        if (o1.getPunt() > o2.getPunt()) return -1;
        if (o1.getPunt() < o2.getPunt()) return 1;
        if (o1.getPunt() == o2.getPunt()){
            if (o1.getTime() > o2.getTime()) return 1;
            if (o1.getTime() < o2.getTime()) return -1;
        }
        return 0;
    }
}
