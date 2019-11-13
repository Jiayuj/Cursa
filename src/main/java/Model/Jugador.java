package Model;


public class Jugador {

    private static String nomjugador;
    String nom;
    private static int puntjugador;
    int punt;

    public  String getNomjugador() {
        return nomjugador;
    }

    public  void setNomjugador(String nomjugador) {
        Jugador.nomjugador = nomjugador;
    }

    public int getPuntjugador() {
        return puntjugador;
    }

    public void setPuntjugador(int puntjugador) {
        this.puntjugador = puntjugador;
    }
}
