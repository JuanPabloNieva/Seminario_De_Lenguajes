package Entregable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestComparable {
    public static void main(String[] args) {
        AnalistaCalidad analista1 = new AnalistaCalidad("Perez", "Jose", "14354", false);
        AnalistaCalidad analista2 = new AnalistaCalidad("Gonzalez", "Maria", "16554", true);
        DiseniadorGrafico diseniador1 = new DiseniadorGrafico("Gutierrez", "Miguel", "UX");
        DiseniadorGrafico diseniador2 = new DiseniadorGrafico("Mendez", "Lucia", "UI");
        Desarrollador desarrollador1 = new Desarrollador("Juarez", "Pablo", "32232", "Java");
        Desarrollador desarrollador2 = new Desarrollador("Lapa", "Marcela", "34565", "Kotlin");
        Desarrollador desarrollador3 = new Desarrollador("Martinez", "Laureano", "16554", "C#");
        GerenteProyecto gerente = new GerenteProyecto("Altamiranda", "Milagros", new Empleado[]{analista1, analista2, diseniador1, diseniador2});

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(analista1);
        listaEmpleados.add(analista2);
        listaEmpleados.add(diseniador1);
        listaEmpleados.add(diseniador2);
        listaEmpleados.add(desarrollador1);
        listaEmpleados.add(desarrollador2);
        listaEmpleados.add(desarrollador3);
        listaEmpleados.add(gerente);

        System.out.println("Lista desordenada:");
        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado);
        }
        System.out.println("");
        Collections.sort(listaEmpleados);
        System.out.println("Lista ordenada:");
        GeneradorDeReportes.imprimirObjetos(listaEmpleados.toArray(new Exportable[0]));
    }
}
