package Entregable;

import java.time.LocalDate;

public class DiseniadorGrafico extends Empleado {

    private String especializacion;
    private boolean usaFigma;

    public DiseniadorGrafico(String apellido, String nombres, String especializacion) {
        super(apellido, nombres);
        this.especializacion = especializacion;
        this.usaFigma = false;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public boolean isUsaFigma() {
        return usaFigma;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public void setUsaFigma(boolean usaFigma) {
        this.usaFigma = usaFigma;
    }

    @Override
    public String toString() {
        return "Diseñador: " + this.getNombres() + " " + this.getApellido() + " - Especialización: " + this.getEspecializacion();
    }

    public String exportarAString() {
        return this.toString();
    }
}
