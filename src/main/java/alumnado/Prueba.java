package alumnado;

import java.util.Random;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class Prueba {

    public static void main(String[] args) {

        Random rd = new Random();

        Alumnado alumnado = new Alumnado();

        alumnado.addAlumno(new Alumno("123", "Alberto", "Lopez"));
        alumnado.addAlumno(new Alumno("453", "Ismael", "Melgar"));
        alumnado.addAlumno(new Alumno("345", "Pablo", "Mariscal"));
        alumnado.addAlumno(new Alumno("765", "Raquel", "Moyano"));

        //rellena las notas
        for (Alumno alumno : alumnado.getAlumnado().values()) {
            for (Asignatura asignatura : alumno.getLibroCalificaciones()) {
                asignatura.setCalificaciones(rd.nextInt(11), rd.nextInt(11), 0);
            }
        }

        //imprime a todos los alumnos
        System.out.println(alumnado.toString());
        
        //imprime suspensos programacion
        for(Alumno alumno : alumnado.consultaSuspensosProgramacion()){
            System.out.println(alumno + "\n");
        }
    }
}
