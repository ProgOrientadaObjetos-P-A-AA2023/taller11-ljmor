package paquete02;

public abstract class Menu {
    
    protected String nombrePlato;
    protected double valorInicialMenu;
    protected double valorMenu;

    public Menu(String nomPlat, double valInM) {
        nombrePlato = nomPlat;
        valorInicialMenu = valInM;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String n) {
        nombrePlato = n;
    }

    public double getValorInicialMenu() {
        return valorInicialMenu;
    }

    public void setValorInicialMenu(double n) {
        valorInicialMenu = n;
    }

    public double getValorMenu() {
        return valorMenu;
    }

    public abstract void calcularValorMenu();
    
}
