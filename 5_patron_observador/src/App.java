public class App {

    public static void main(String[] args) {
        AlarmaLibro a = new AlarmaLibro();

        a.attach(new Compras());
        a.attach(new Administracion());
        a.attach(new Stock());

        Libro libro = new Libro("El Quijote", "MALO");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.devuelveLibro(libro);


    }
}
