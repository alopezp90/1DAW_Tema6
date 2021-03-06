package ej15;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class Diputado extends Legislador {

    private int numeroAsiento;

    public Diputado(int numeroAsiento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.numeroAsiento = numeroAsiento;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    @Override
    public String getCamara() {
        return "Diputado";
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "\n" + this.getCamara() + "\tAsiento: " + this.numeroAsiento; 
    }
}
