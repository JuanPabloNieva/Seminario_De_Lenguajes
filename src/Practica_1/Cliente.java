package Practica_1;
/*
Implementar la Clase Cliente con los atributos: nombre, apellido, domicilio. implemente
el metodo toString(), que devuelve un objeto String. En este metodo declare una
variable local de tipo StringBuffer llamada data y utilice el metodo append() para
adjuntar atributos de la clase en cuestión. Utilice el metodo toString() de la clase
StringBuffer para devolver el objeto String desde la variable data.
a. Para probar crear instancias de la clase y luego, en el metodo principal de la
clase utilice el metodo System.out.printIn(objeto.toString()) para mostrar los
datos de la misma usando la forma.
b. Luego, utilice System.out.printIn(objeto) y vea que imprime por consola.
c. ¿Cuál es la diferencia entre estas dos formas de imprimir el objeto?
*/
public class Cliente {
    private String nombre;
    private String apellido;
    private String domicilio;

    public Cliente(String nombre, String apellido, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
    }

    public Cliente() {}

    public String toString(){
        StringBuffer data = new StringBuffer();
        data.append(nombre);
        data.append(" ");
        data.append(apellido);
        data.append(" ");
        data.append(domicilio);

        return data.toString();
    }

    public static void main(String[] args) {
        Cliente c = new Cliente("Juan", "Gomez", "ABC 213");

        System.out.println(c.toString());
        System.out.println(c);
    }
}
