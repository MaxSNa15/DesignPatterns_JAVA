package Adapter;

public class App{

    public static void main(String[] args) {
        FocoClasico f_clasico = new FocoClasico();
        FocoModerno f_moderno = new FocoModerno();
        //Vela vela = new Vela();
        FocoAdapter f_adapter = new FocoAdapter();

        System.out.println("Foco clásico:");
        System.out.println(f_clasico.encender());
        System.out.println(f_clasico.aumentarIntensidad());
        System.out.println(f_clasico.apagar());
        System.out.println();

        System.out.println("Foco moderno:");
        System.out.println(f_moderno.encender());
        System.out.println(f_moderno.aumentarIntensidad());
        System.out.println(f_moderno.apagar());
        System.out.println();

        System.out.println("Veladora adaptada:");
        System.out.println(f_adapter.encender());
        System.out.println(f_adapter.aumentarIntensidad());
        System.out.println(f_adapter.apagar());
    }
}