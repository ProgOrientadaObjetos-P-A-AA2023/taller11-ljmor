package paquete02;

public class MenuCarta extends Menu{
    
    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeAdd;

    public MenuCarta(double valGu, double valBe, double porcAd,
            String nomPlat, double valInM) {
        super(nomPlat, valInM);
        valorGuarnicion = valGu;
        valorBebida = valBe;
        porcentajeAdd = porcAd;
    }

    public double getValorGuarnicion() {
        return valorGuarnicion;
    }

    public void setValorGuarnicion(double a) {
        valorGuarnicion = a;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double a) {
        valorBebida = a;
    }

    public double getPorcentajeAdd() {
        return porcentajeAdd;
    }

    public void setPorcentajeAdd(double a) {
        porcentajeAdd = a;
    }

    @Override
    public void calcularValorMenu() {
        double add = (valorInicialMenu * porcentajeAdd)/100;
        valorMenu = valorInicialMenu + valorBebida + valorGuarnicion + add;
    }

    @Override
    public String toString() {
        String m = String.format("\nMenu a la Carta:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial del menu: $%.2f\n"
                + "\tValor porcion de guarnicion: $%.2f\n"
                + "\tValor bebida: $%.2f\n"
                + "\tPorcentaje adicional: %.2f porciento.\n\n",
                nombrePlato,
                valorInicialMenu,
                valorGuarnicion,
                valorBebida,
                porcentajeAdd,
                valorMenu);
        return m;
    }
    
    
}
