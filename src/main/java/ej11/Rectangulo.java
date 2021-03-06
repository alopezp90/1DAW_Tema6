package ej11;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */

public class Rectangulo extends Figura {

    public Rectangulo(double base, double altura) {
        super(base, altura, "Rectangulo");
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

}
