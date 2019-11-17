package Model;

public class Classificació implements Comparable<Classificació> {


    private String nom;
    private double time;
    private int punt = 0;

    public Classificació(String nom, double time, int punt) {
        this.nom = nom;
        this.time = time;
        this.punt = punt;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int getPunt() {
        return punt;
    }

    public void setPunt(int punt) {
        this.punt = punt;
    }

    @Override
    public String toString() {
        return
                " nom='" + nom + '\'' +
                ", time=" + time +
                ", punt=" + punt +"\n";
    }


    @Override
    public int compareTo(Classificació o) {
        if(o.getTime()==this.time)
            return 0;
        else if(o.getTime()<this.time)
            return 1;
        else
            return -1;
    }
}
