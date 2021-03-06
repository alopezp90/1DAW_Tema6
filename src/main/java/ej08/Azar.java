package ej08;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */

public abstract class Azar {

    protected int posibilidades;

    public int getPosibilidades() {
        return posibilidades;
    }

    public void setPosibilidades(int posibilidades) {
        this.posibilidades = posibilidades;
    }

    public abstract int lanzar();
}
