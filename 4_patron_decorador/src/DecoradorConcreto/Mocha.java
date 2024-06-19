package DecoradorConcreto;

import Decorator.IngredienteDecorator;
import InterfaceDecorator.Bebida;

public class Mocha extends IngredienteDecorator{
    public Mocha(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Mocha";
    }

    @Override
    public double costo() {
        return  0.50 + bebida.costo();
    }
}
