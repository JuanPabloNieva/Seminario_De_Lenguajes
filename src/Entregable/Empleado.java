package Entregable;
import java.time.LocalDate;

public abstract class Empleado {
    private String nombres;
    private String apellido;
    private String legajo;
    private String email;
    private LocalDate fechaIngreso;

    public Empleado(String apellido, String nombres, String legajo) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public Empleado(String apellido, String nombres) {
        this.nombres = nombres;
        this.apellido = apellido;
    }

    public Empleado(){}

    public void setNombres(String nombres){
        this.nombres = nombres;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setLegajo(String legajo){
        this.legajo = legajo;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setFechaIngreso(LocalDate fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombres() {
        return this.nombres;
    }
    public String getApellido() {
        return this.apellido;
    }
    public String getLegajo() {
        return this.legajo;
    }
    public String getEmail() {
        return this.email;
    }
    public LocalDate getFechaIngreso() {
        return this.fechaIngreso;
    }
}
