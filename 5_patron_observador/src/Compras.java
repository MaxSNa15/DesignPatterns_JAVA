public class Compras implements ILibroMalEstado {

    @Override
    public void update() {
        System.out.println("Departamento de compras: ");
        System.out.println("Solicitamos un nuevo ejemplar del libro");
        System.out.println("Realizamos un pedido al proveedor");
    }
}
