package Adapter;

public class FocoClasico extends Foco{
    
        public FocoClasico() { }
    
        @Override
        public String encender() {
            return "Encendiendo foco clásico";
        }
    
        @Override
        public String aumentarIntensidad() {
            return "Aumentando intensidad de foco clásico";
        }
    
        @Override
        public String apagar() {
            return "Apagando foco clásico";
        }
}
