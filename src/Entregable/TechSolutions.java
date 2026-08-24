package Entregable;

public class TechSolutions {

    public static void imprimirEmpleados(Empleado[] e){
        for(Empleado empleado : e){
            System.out.println(empleado);
        }
    }

    public static void main(String[] args) {
        AnalistaCalidad analista1 = new AnalistaCalidad("Perez", "Jose", "14354", false);
        AnalistaCalidad analista2 = new AnalistaCalidad("Gonzalez", "Maria", "16554", true);
        DiseniadorGrafico diseniador1 = new DiseniadorGrafico("Gutierrez", "Miguel", "UX");
        DiseniadorGrafico diseniador2 = new DiseniadorGrafico("Mendez", "Lucia", "UI");
        Desarrollador desarrollador1 = new Desarrollador("Juarez", "Pablo", "32232", "Java");
        Desarrollador desarrollador2 = new Desarrollador("Lapa", "Marcela", "34565", "Kotlin");
        Desarrollador desarrollador3 = new Desarrollador("Martinez", "Laureano", "16554", "C#");
        GerenteProyecto gerente = new GerenteProyecto("Altamiranda", "Milagros",new Empleado[]{analista1, analista2, diseniador1, diseniador2});

        TechSolutions.imprimirEmpleados(new Empleado[]{gerente, analista1, analista2, diseniador1, diseniador2, desarrollador1, desarrollador2, desarrollador3});

    }
}
