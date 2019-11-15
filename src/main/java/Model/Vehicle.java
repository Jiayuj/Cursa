package Model;

import View.Menu;

public class Vehicle {
    String tipo;
    double velocidadMax;
    double velocidadMin;

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public double getVelocidadMin() {
        return velocidadMin;
    }

    public String setTipo() {
        String opcion = new Menu().trialvehicle();
        switch (opcion){
            case "bicicleta":
                velocidadMax= 25.99;
                velocidadMin= 20.99;
                break;
            case "cotxe":
                velocidadMax= 15.99;
                velocidadMin= 10.99;
                break;
            case "camió":
                velocidadMax= 20.99;
                velocidadMin= 15.99;
                break;
            case "moto":
                velocidadMax= 10.99;
                velocidadMin= 5.99;
                break;
        }
        return opcion;
    }
}
