package ej11;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public abstract class Figura {

    protected double base;
    protected double altura;
    protected String nombreFigura;

    public Figura(double base, double altura, String nombreFigura) {
        this.base = base;
        this.altura = altura;
        this.nombreFigura = nombreFigura;
    }

    public final double getBase() {
        return base;
    }

    public final double getAltura() {
        return altura;
    }

    public abstract double calcularArea();

    public final String areaString(double area) {
        return "Area del " + this.nombreFigura + " = " + (int)area + "cm²";
    }
}
