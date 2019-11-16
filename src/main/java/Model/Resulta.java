package Model;

import java.util.List;

public class Resulta {

    private String campionat;
    private List<Classificació> list;

    public Resulta(String campionat, List<Classificació> list) {
        this.campionat = campionat;
        this.list = list;
    }

    public String getCampionat() {
        return campionat;
    }

    public void setCampionat(String campionat) {
        this.campionat = campionat;
    }

    public List<Classificació> getList() {
        return list;
    }

    public void setList(List<Classificació> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "{" +
                "list=" + list +
                '}';
    }
}
