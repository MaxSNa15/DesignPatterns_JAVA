package Factory.Logistica;

import Factory.Transporte.Terrestre;
import Factory.Transporte.Transporte;

public class LogisticaTerrestre extends Logistica{
    @Override
    public Transporte CreaLogisticaYCargo() {
        return new Terrestre();
    }
}
