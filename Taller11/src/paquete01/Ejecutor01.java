package paquete01;

import java.util.ArrayList;
import java.util.List;
import paquete02.Cuenta;
import paquete02.Menu;
import paquete02.MenuCarta;
import paquete02.MenuDia;
import paquete02.MenuEconomico;
import paquete02.MenuNinios;

public class Ejecutor01 {

    public static void main(String[] args) {
        List<Menu> lista = new ArrayList<>();
        
        MenuNinios menuNinios01 = 
                new MenuNinios(1, 1.5, "Niños 01",2);
        menuNinios01.calcularValorMenu();
        lista.add(menuNinios01);
        
        MenuNinios menuNinios02 = 
                new MenuNinios(1, 1.5, "Niños 02",3);
        menuNinios02.calcularValorMenu();
        lista.add(menuNinios02);
        
        MenuEconomico menuEconomico01 = 
                new MenuEconomico(25, "Econo 001", 4);
        menuEconomico01.calcularValorMenu();
        lista.add(menuEconomico01);
        
        MenuDia menuDia01 = 
                new MenuDia(1, 1, "Dia 001", 5);
        menuDia01.calcularValorMenu();
        lista.add(menuDia01);
        
        MenuCarta menuCarta01 =
                new MenuCarta(1.5, 2, 10, "Carta001",
                        6);
        menuCarta01.calcularValorMenu();
        lista.add(menuCarta01);
        
        Cuenta cuenta01 = new Cuenta("René Elizalde", lista, 10);
        cuenta01.calcularValorSubtotal();
        cuenta01.calcularValorTotal();
        
        System.out.println(cuenta01);
        
    }
        
}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/