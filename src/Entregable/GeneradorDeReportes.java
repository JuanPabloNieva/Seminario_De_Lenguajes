package Entregable;

public class GeneradorDeReportes {
    public static void imprimirObjetos(Exportable[] e) {
        for (Exportable empleado : e) {
            System.out.println(empleado);
        }
    }
}
