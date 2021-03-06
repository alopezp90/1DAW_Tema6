package ej08;

import java.util.Random;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */

public class Moneda extends Azar {

    private static Random rd = new Random();

    public Moneda() {
        this.setPosibilidades(2);
    }

    @Override
    public int lanzar() {
        return rd.nextInt(2) + 1;
    }

}
