package Entregable;

import java.time.LocalDate;

public class GerenteProyecto extends Empleado{

    private Empleado[] empleados;

    public GerenteProyecto(){}

    public GerenteProyecto(String apellido, String nombres,  Empleado[] empleados){
        super(nombres, apellido);
        this.empleados = empleados;
    }

    public Empleado[] getEmpleados() {
        return this.empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "GerenteProyecto {" + "empleados=" + empleados + '}';
    }
}
