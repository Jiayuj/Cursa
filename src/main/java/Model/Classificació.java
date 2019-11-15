package Model;

import java.util.Objects;

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
        Double obj1 = o.time;
        Double obj2 = this.time;
        int retval =  obj2.compareTo(obj1);
        return retval;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classificació classificació = (Classificació) o;
        return time == classificació.time;
    }

    @Override
    public int hashCode() {
        return Objects.hash(time);
    }
}
