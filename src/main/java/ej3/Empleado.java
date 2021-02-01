package ej3;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Empleado extends Persona{

    private double salario;
    
    public Empleado() {
        super();
        this.salario = 900;
    }
    
    public Empleado(String nombre, String nif, int edad, double salario) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalario=" + salario;
    }
    
    public void aumento(double cantidad) {
        this.salario += cantidad;
    }
}
