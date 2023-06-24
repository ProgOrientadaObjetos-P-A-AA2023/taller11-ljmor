package paquete02;


public class MenuNinios extends Menu{

    private double valorHelado;
    private double valorPastel;

    public MenuNinios(double valHel, double valPas, String nomPlat, 
            double valInM) {
        super(nomPlat, valInM);
        valorHelado = valHel;
        valorPastel = valPas;
    }

    public double getValorHelado() {
        return valorHelado;
    }

    public void setValorHelado(double c) {
        valorHelado = c;
    }

    public double getValorPastel() {
        return valorPastel;
    }

    public void setValorPastel(double c) {
        valorPastel = c;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu + valorHelado + valorPastel;
    }

    @Override
    public String toString() {
                String m = String.format("\nMenu de Niños:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial del menu: $%.2f\n"
                + "\tValor porcion de helado: $%.2f\n"
                + "\tValor porcion de pastel: $%.2f\n"
                + "\tValor del Menu: $%.2f\n\n",
                nombrePlato,
                valorInicialMenu,
                valorHelado,
                valorPastel,
                valorMenu);
        return m;
    }
    
}
