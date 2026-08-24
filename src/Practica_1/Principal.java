package Practica_1;

/*
En el metodo main de la clase “Principal” declare un StringBuffer llamado sb e
inicialícelo con “Hola”. Utilizando el metodo StringBuffer insert() inserte “Sr” en la 6ta
posición del StringBuffer “Garcia”. Agregue un nombre “Fernando” al final del
StringBuffer sb utilizando el metodo append(). Utilice System.out.printIn() para mostrar
el saludo. El objeto out es un objeto de la clase PrintStream. Esta clase tiene metodos
sobrecargados print() y printIn(). Éstos son particularmente útiles para la salida de la
consola.
*/

public class Principal {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hola");

        sb.insert(4, " Sr");
        sb.append(" Fernando");

        System.out.println(sb);
    }
}
