package alumnado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class Alumnado {

    private Map<String, Alumno> alumnado;

    public Alumnado() {
        alumnado = new HashMap<>();
    }

    public void addAlumno(Alumno alumno) {
        alumnado.put(alumno.getNumeroExpediente(), alumno);
    }

    public Map<String, Alumno> getAlumnado() {
        return alumnado;
    }
    
    public Alumno consultaExpediente(String expediente) {
        return alumnado.get(expediente);
    }
    
    public ArrayList<Alumno> consultaSuspensosProgramacion(){
        ArrayList<Alumno> suspensosProgramacion = new ArrayList<>();
        for(Alumno alumno : alumnado.values()) {
            if(!alumno.haAprobadoProgramacionEsteTrimestre()){
                suspensosProgramacion.add(alumno);
            }
        }
        return suspensosProgramacion;
    }

    @Override
    public String toString() {
        String txt = "";
        for(Alumno alumno : alumnado.values()){
            txt += alumno + "\n";
        }
        return txt;
    }
}