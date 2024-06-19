package Adapter;

public class FocoModerno extends Foco{
    
        public FocoModerno() { }
    
        @Override
        public String encender() {
            return "Encendiendo foco moderno";
        }
    
        @Override
        public String aumentarIntensidad() {
            return "Aumentando intensidad de foco moderno";
        }
    
        @Override
        public String apagar() {
            return "Apagando foco moderno";
        }
}