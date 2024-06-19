public class Playa {
    private String nomplaya;
    private int viento;
    private double temperatura;

    public Playa(String nomplaya, int viento, double temperatura) {
        this.nomplaya = nomplaya;
        this.viento = viento;
        this.temperatura = temperatura;
    }

    public String getNomplaya() {
        return nomplaya;
    }

    public void setNomplaya(String nomplaya) {
        this.nomplaya = nomplaya;
    }

    public int getViento() {
        return viento;
    }

    public void setViento(int viento) {
        this.viento = viento;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
