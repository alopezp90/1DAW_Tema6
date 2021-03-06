package ej08;

import java.util.Random;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */

public class Dado extends Azar {

    private static Random rd = new Random();

    public Dado() {
        this.setPosibilidades(6);
    }

    @Override
    public int lanzar() {
        return rd.nextInt(6) + 1;
    }

}
