package ej09;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */

public abstract class Vehiculo { 

    private int bastidor;

    public final void setBastidor(int bastidor) {
        this.bastidor = bastidor;
    }

    public abstract int getVelocidad();
}

/*
La clase puede tener descendencia, puesto que NO es final.
getVelocidad puede y DEBE sobreescribirse en cada hijo, setBastidor es final
por lo tanto no podra sobreescribirse
*/
