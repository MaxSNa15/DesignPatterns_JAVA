package DecoratorApp;

import Componente.Cafe;
import DecoradorConcreto.Mocha;
import InterfaceDecorator.Bebida;

public class DecoratorApp {
    public static void main(String[] args) {

        // Llega un cliente y pide un café
        Bebida miCafe = new Cafe();
        System.out.println(miCafe.getDescripcion() + " $" + miCafe.costo());

        // Llega un cliente y pide un café con mocha
        miCafe = new Mocha(miCafe);
        System.out.println(miCafe.getDescripcion() + " $" + miCafe.costo());
    }
}
