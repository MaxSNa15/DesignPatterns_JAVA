import java.util.ArrayList;

public class AlarmaLibro implements Subject {
    public static ArrayList<ILibroMalEstado> observadores = new ArrayList<ILibroMalEstado>();

    @Override
    public void attach(ILibroMalEstado ui) {
        observadores.add(ui);
    }

    @Override
    public void dettach(ILibroMalEstado ui) {
        observadores.remove(ui);
    }

    @Override
    public void notifyObservers() {
        for (ILibroMalEstado observador : observadores) {
            observador.update();
        }
    }
}
