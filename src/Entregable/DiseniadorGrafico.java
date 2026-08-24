package Entregable;

public class DiseniadorGrafico extends Empleado{

    private String especializacion;
    private boolean usaFigma;

    public DiseniadorGrafico(String apellido, String nombres, String especializacion){
        super(apellido, nombres);
        this.especializacion = especializacion;
        this.usaFigma = false;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public boolean isUsaFigma() {
        return usaFigma;
    }

    public void setUsaFigma(boolean usaFigma) {
        this.usaFigma = usaFigma;
    }
}
