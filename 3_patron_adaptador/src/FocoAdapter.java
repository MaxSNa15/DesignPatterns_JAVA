package Adapter;

public class FocoAdapter extends Foco{

    private final Vela VELA = new Vela();

    public FocoAdapter() { }
    
    @Override
    public String encender() {
            return VELA.encenderFuego();
        }

    @Override
    public String aumentarIntensidad() {
            return VELA.agregarCombustible();
        }
    
    @Override
    public String apagar() {
            return VELA.apagarFuego();
        }
}