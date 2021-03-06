package ej11;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */

public class Triangulo extends Figura{

    public Triangulo(double base, double altura) {
        super(base, altura, "Triangulo");
    }

    @Override
    public double calcularArea() {
        return base * altura / 2;
    }
}

