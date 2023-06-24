package paquete02;

import java.util.List;

public class Cuenta {
    private String nombreCliente;
    private List<Menu> menus;
    private double valorTotal;
    private double valorSubtotal;
    private double valorIva;

    public Cuenta(String nomClie, List<Menu> men, double valIv) {
        nombreCliente = nomClie;
        menus = men;
        valorIva = valIv;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String x) {
        nombreCliente = x;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> x) {
        menus = x;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void calcularValorTotal() {
        double add = (valorSubtotal * valorIva)/100;
        valorTotal = valorSubtotal + add;
    }

    public double getValorSubtotal() {
        return valorSubtotal;
    }

    public void calcularValorSubtotal() {
        double suma = 0;
        for (int i = 0; i < menus.size(); i++) {
            suma += menus.get(i).getValorMenu();
        }
        
        valorSubtotal = suma;
    }

    public double getValorIva() {
        return valorIva;
    }

    public void setValorIva(double x) {
        valorIva = x;
    }

    @Override
    public String toString() {
        String m = String.format("Factura\n"
                + "Cliente: %s", 
                nombreCliente);
        
        for (int i = 0; i < menus.size(); i++) {
            m = String.format("%s%s",
                    m,
                    menus.get(i));
        }
        
        m = String.format("%sSubtotal: $%.2f\n"
                + "IVA: %.2f porciento\n"
                + "Total a Pagar: $%.3f\n",
                m,
                valorSubtotal,
                valorIva,
                valorTotal);
        
        return m;
    }
    
    
}
