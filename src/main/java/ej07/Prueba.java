package ej07;

import java.util.ArrayList;

/**
 * @author Alberto López Puertas 
 * <https://github.com/alopezp90>
 */

public class Prueba {

    public static void main(String[] args) {
        
        ArrayList<Trabajador> listado = new ArrayList<>();
        
        listado.add(new Camarero("soldado raso", "paco", "gutierrez", "123"));
        listado.add(new Camarero("capitan", "raul", "lopez", "432"));
        listado.add(new Obrero(1, "carlos", "ruiz", "234"));
        listado.add(new Obrero(2, "luis", "fernandez", "876"));
        
        for (Trabajador trabajador : listado) {
            trabajador.cotizar();
        }        
    }
}
