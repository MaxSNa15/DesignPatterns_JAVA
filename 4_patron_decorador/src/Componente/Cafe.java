package Componente;
import InterfaceDecorator.Bebida;

public class Cafe implements Bebida {
    @Override
    public String getDescripcion() {
        return "Café";
    }

    @Override
    public double costo() {
        return 1.99;
    }
}
