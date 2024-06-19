package Factory;

import Factory.Logistica.*;

public class App {

    public static void main(String[] args) {
        LogisticaAerea pajaro = new LogisticaAerea();
        pajaro.muestraLogisticaYCargoExtra();

        LogisticaTerrestre carrito = new LogisticaTerrestre();
        carrito.muestraLogisticaYCargoExtra();

        LogisticaMarina sirena = new LogisticaMarina();
        sirena.muestraLogisticaYCargoExtra(); 
    } 
}
