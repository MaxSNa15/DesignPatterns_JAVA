package Factory.Logistica;

import Factory.Transporte.Maritima;
import Factory.Transporte.Transporte;

public class LogisticaMarina extends Logistica{
    @Override
    public Transporte CreaLogisticaYCargo() {
        return new Maritima();
    }
}
