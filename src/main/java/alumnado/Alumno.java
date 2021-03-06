package alumnado;

import java.util.ArrayList;

/**
 *
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class Alumno {

    private String numeroExpediente;
    private String nombre;
    private String apellido;
    private ArrayList<Asignatura> LibroCalificaciones;

    private final NombreAsignatura[] ASIGNATURAS_1DAW = {NombreAsignatura.BADAT,
        NombreAsignatura.ENDES, NombreAsignatura.FOL, NombreAsignatura.LENGUAJE,
        NombreAsignatura.PROGRAMACION, NombreAsignatura.SISTEMAS};

    public Alumno(String expediente, String nombre, String apellido) {
        this.numeroExpediente = expediente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.LibroCalificaciones = new ArrayList<>();
        for (NombreAsignatura nombreAsignatura : ASIGNATURAS_1DAW) {
            LibroCalificaciones.add(new Asignatura(nombreAsignatura));
        }
    }

    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ArrayList<Asignatura> getLibroCalificaciones() {
        return LibroCalificaciones;
    }

    public boolean haAprobadoProgramacionEsteTrimestre() {
        for (Asignatura asignatura : LibroCalificaciones) {
            if (asignatura.getNombre().equals(NombreAsignatura.PROGRAMACION)) {
                if (LibroCalificaciones.get(LibroCalificaciones.indexOf(asignatura))
                        .getCalificaciones()[1] >= 5) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String txt = numeroExpediente + "\t" + nombre + "\t" + apellido;
        for (Asignatura asignatura : LibroCalificaciones) {
            txt += "\n" + asignatura.toString();
        }
        return txt;
    }

}
