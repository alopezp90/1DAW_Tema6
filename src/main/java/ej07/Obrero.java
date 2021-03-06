package ej07;

/**
 * @author Alberto López Puertas 
 * <https://github.com/alopezp90>
 */

public class Obrero extends Trabajador {

    // Único atributo propio de Camarero
    private int categoria;

    public Obrero(int categoria, String nombre, String apellido1,
            String NIF) {
        // Llamada al constructor de la superclase
        super(nombre, apellido1, NIF);
        this.categoria = categoria;
    }

    // Método propio de obrero
    public void ponerLadrillos() {
        System.out.println("Objeto Obrero: Poniendo ladrillos");
    }

    @Override
    // Método sobrescrito
    public void cotizar() {
        System.out.println("Cotizando como Obrero");
    }
}