package Factory.Logistica;
import Factory.Transporte.Transporte;

public abstract class Logistica {
    public void muestraLogisticaYCargoExtra(){
        CreaLogisticaYCargo().TipoEntrega();
        CreaLogisticaYCargo().CargoTipoEntrega();
    }

    public abstract Transporte CreaLogisticaYCargo();
}
