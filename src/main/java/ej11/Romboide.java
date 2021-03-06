package ej11;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */

public class Romboide extends Figura {

    public Romboide(double base, double altura) {
        super(base, altura, "Romboide");
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

}
