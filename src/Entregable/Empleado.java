package Entregable;

import java.time.LocalDate;

public abstract class Empleado implements Exportable, Comparable<Empleado> {
    private String apellido;
    private String nombres;
    private String legajo;
    private String email;
    private LocalDate fechaIngreso;

    public Empleado() {
    }

    public Empleado(String apellido, String nombres) {
        this.nombres = nombres;
        this.apellido = apellido;
    }

    public Empleado(String apellido, String nombres, String legajo) {
        this(apellido, nombres);
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Empleado: " + this.getApellido() + this.getNombres() + " - Legajo " + this.getLegajo();
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
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

    public int exportarAInteger() {
        return this.hashCode();
    }

    @Override
    public int compareTo(Empleado o) {
        if (this.apellido.compareToIgnoreCase(o.apellido) <= 0) {
            return -1;
        } else {
            return 1;
        }
    }
}