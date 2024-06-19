package Factory.Transporte;

public class Maritima implements Transporte{
    public Maritima() {
    }
    
    @Override
    public void TipoEntrega() {
        System.out.println("Entrega por barco de un asociado particular con un cargo extra de: $" 
        + CargoTipoEntrega());
    }

    @Override
    public double CargoTipoEntrega() {
        return 1100;
    }
}
