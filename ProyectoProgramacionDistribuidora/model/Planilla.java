package model;
import java.util.ArrayList;
import java.util.List;

public class Planilla {
     private List<Empleado> empleados;

    public Planilla() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(int id) {
        empleados.removeIf(e -> e.getId() == id);
    }

    public Empleado buscarEmpleado(int id) {
        for (Empleado e : empleados) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
    return "Planilla{" + "empleados=" + empleados + '}';
}

}
