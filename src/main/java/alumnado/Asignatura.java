package alumnado;

import java.util.Arrays;

/**
 *
 * @author Alberto López Puertas 
 * <https://github.com/alopezp90>
 */
public class Asignatura {

    private NombreAsignatura nombre;
    private int[] calificaciones;
    
    public Asignatura(NombreAsignatura nombre){
        this.nombre = nombre;
        this.calificaciones = new int[3];
    }

    public void setCalificaciones(int n, int m, int p) {
        if (n >= 0 && n <= 10) {
            calificaciones[0] = n;
        }
        if (m >= 0 && m <= 10) {
            calificaciones[1] = m;
        }
        if (p >= 0 && p <= 10) {
            calificaciones[2] = p;
        }
    }

    public NombreAsignatura getNombre() {
        return nombre;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    @Override
    public String toString() {
        return "\t" + nombre + "\t" + Arrays.toString(calificaciones);
    }
}
