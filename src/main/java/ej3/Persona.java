package ej3;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Persona {

    private String nombre;
    private String nif;
    private int edad;
    
    public Persona() {
        this.nombre = "Vico";
        this.nif = "12345678A";
        this.edad = 25;
    }
    
    public Persona(String nombre, String nif, int edad) {
        this.nombre = nombre;
        this.nif = nif;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona:\nNombre=" + nombre + "\tNif=" + nif + "\tEdad=" + edad;
    }
}
