package paquete02;

public class MenuDia extends Menu {

    private double valorPostre;
    private double valorBebida;

    public MenuDia(double valPos, double valBe,
            String nomPlat, double valInM) {
        super(nomPlat, valInM);
        valorPostre = valPos;
        valorBebida = valBe;
    }

    public double getValorPostre() {
        return valorPostre;
    }

    public void setValorPostre(double b) {
        valorPostre = b;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double b) {
        valorBebida = b;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu + valorBebida + valorPostre;
    }

    @Override
    public String toString() {
        String m = String.format("Menu del Dia:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial del menu: $%.2f\n"
                + "\tValor del postre: $%.2f\n"
                + "\tValor bebida: $%.2f\n"
                + "\tValor del Menu: $%.2f\n\n",
                nombrePlato,
                valorInicialMenu,
                valorPostre,
                valorBebida,
                valorMenu);
        return m;
    }

}
