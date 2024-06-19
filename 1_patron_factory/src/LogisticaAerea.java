package Factory.Logistica;

import Factory.Transporte.Aerea;
import Factory.Transporte.Transporte;

public class LogisticaAerea extends Logistica{
    @Override
    public Transporte CreaLogisticaYCargo() {
        return new Aerea("Aeromexico");
    }  
}
