package Entregable;

public class Desarrollador extends Empleado {
    private String lenguaje;

    public Desarrollador(String apellido, String nombres, String legajo, String lenguaje) {
        super(apellido, nombres, legajo);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
}
