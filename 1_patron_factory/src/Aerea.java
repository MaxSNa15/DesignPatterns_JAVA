package Factory.Transporte;

public class Aerea implements Transporte{
    private String company = "";

    public Aerea(String company) {
        this.company = company;
    }

    @Override
    public void TipoEntrega() {
        System.out.println("Entrega por avión y depende de la compañía con cargo extra de: $" 
        + CargoTipoEntrega());
    }

    @Override
    public double CargoTipoEntrega() {
       if (this.company.equals("Aeromexico")) {
         return 700.00;
       }
       else if (this.company.equals("Volaris")) {
        return 1000.00;
       }
       else if (this.company.equals("Continental")) {
        return 950.00;
       }
       else return -1;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }   
}
