package ej15;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class Senador extends Legislador {

    private double complemento;

    public Senador(double complemento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.complemento = complemento;
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    @Override
    public String getCamara() {
        return "Senador";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n" + this.getCamara() + "\tComplemento: " + this.complemento;
    }
}
