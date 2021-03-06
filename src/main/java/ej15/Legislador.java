package ej15;

/**
 * @author Alberto López Puertas 
 * <https://github.com/alopezp90>
 */

public abstract class Legislador extends Persona{

    private String provincia;
    private String partidoPolitico;
    
    public Legislador(String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.provincia = provincia;
        this.partidoPolitico = partidoPolitico;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
    
    public abstract String getCamara();

    @Override
    public String toString() {
        return this.getNombre() + "\t" + this.getApellidos() 
                + "\n" + this.provincia + "\t" + this.partidoPolitico;
    }   
}
