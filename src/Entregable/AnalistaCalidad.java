package Entregable;

public class AnalistaCalidad extends Empleado{
    private boolean pruebaAutomatizada;

    public AnalistaCalidad(String apellido, String nombres, String legajo, boolean pruebaAutomatizada){
        super(apellido, nombres, legajo);
        this.pruebaAutomatizada = pruebaAutomatizada;
    }

    public void setPruebaAutomatizada(boolean pruebaAutomatizada){
        this.pruebaAutomatizada = pruebaAutomatizada;
    }

    public boolean isPruebaManual(){
        return !this.pruebaAutomatizada;
    }

    public boolean isPruebaAutomatizada(){
        return this.pruebaAutomatizada;
    }
}
