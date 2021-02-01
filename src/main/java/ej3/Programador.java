package ej3;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Programador extends Empleado{
    
    private TipoProgramador tipo;
    
    public Programador() {
        super();
        this.tipo = TipoProgramador.JUNIOR;
    }
    
    public Programador(String nombre, String nif, int edad, double salario, TipoProgramador tipo) {
        super(nombre, nif, edad, salario);
        this.tipo = tipo;
    }

    public TipoProgramador getTipo() {
        return tipo;
    }

    public void setTipo(TipoProgramador tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProgramador: Tipo=" + tipo;
    }
    
    
}
