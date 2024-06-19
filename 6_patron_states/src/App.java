public class App {
    public static void main(String[] args) {
        Playa oPlaya1 = new Playa("Del carribe", 80, 15);
        Playa oPlaya2 = new Playa("Acapulco", 20, 30);

        Semaforo objSemaforo = new Semaforo();

        System.out.println("Alerta playa"+oPlaya1.getNomplaya());
        if (oPlaya1.getViento() < 50 && oPlaya1.getTemperatura() >= 30){
            objSemaforo.setEstado(new EstadoVerde(objSemaforo));
            objSemaforo.mostrarAviso();
        }else if(oPlaya1.getViento() > 1000){
            objSemaforo.setEstado(new EstadoRojo(objSemaforo));
            objSemaforo.mostrarAviso();
        }else{
            objSemaforo.setEstado(new EstadoNaranja(objSemaforo));
            objSemaforo.mostrarAviso();
        }

        System.out.println();
    }
}
