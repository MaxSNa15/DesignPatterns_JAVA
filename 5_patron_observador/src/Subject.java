public interface Subject {
    public void attach(ILibroMalEstado ui);
    public void dettach(ILibroMalEstado ui);
    public void notifyObservers();
}
