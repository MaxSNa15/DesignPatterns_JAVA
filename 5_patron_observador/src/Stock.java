public class Stock implements ILibroMalEstado {

    @Override
    public void update() {
        System.out.println("Departamento de stock: ");
        System.out.println("Se ha actualizado el stock del libro");
        System.out.println("Solicitamos más ejemplares del libro");
    }
}
