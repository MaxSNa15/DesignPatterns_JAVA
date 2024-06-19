package Factory.Transporte;

public class Terrestre implements Transporte{
    public Terrestre() {
    }

    @Override
    public void TipoEntrega() {
        System.out.println("Entregas solo por FedEx con un cargo extra de: $" 
        + CargoTipoEntrega());
    }

    @Override
    public double CargoTipoEntrega() {
        return 100;
    } 
}
