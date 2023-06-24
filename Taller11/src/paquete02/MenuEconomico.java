package paquete02;

public class MenuEconomico extends Menu{
    
    private double porcentajeDesc;

    public MenuEconomico(double porcDesc, String nomPlat, double valInM) {
        super(nomPlat, valInM);
        porcentajeDesc = porcDesc;
    }

    public double getPorcentajeDesc() {
        return porcentajeDesc;
    }

    public void setPorcentajeDesc(double d) {
        porcentajeDesc = d;
    }

    @Override
    public void calcularValorMenu() {
       double porcentaje = (valorInicialMenu * porcentajeDesc)/100;
       valorMenu = valorInicialMenu - porcentaje;
    }

    @Override
    public String toString() {
                String m = String.format("\nMenu Economico:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial del menu: $%.2f\n"
                + "\tPorcentaje de descuento: %.2f porciento.\n"
                + "\tValor del Menu: $%.2f\n\n",
                nombrePlato,
                valorInicialMenu,
                porcentajeDesc,
                valorMenu);
        return m;
    }
    
    
}
