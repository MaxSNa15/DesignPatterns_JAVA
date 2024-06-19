package Decorator;

import InterfaceDecorator.Bebida;

public abstract class IngredienteDecorator implements Bebida {
    protected Bebida bebida;

    public IngredienteDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    public abstract String getDescripcion();
}
