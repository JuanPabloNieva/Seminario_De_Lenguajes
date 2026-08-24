package Practica_1;

public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("Profesor");
        String s2 = new String("Alumno");
        String s3 = s1;
        String s4 = s3;
        String s5 = "Pablo";
        String s6 = "Alumno";
        String s7 = new String("Alumno");
        String s8 = " Pablo ";
        String s9 = new String("profesor");

        System.out.println(s1.equals(s2)); //
        System.out.println(s4.equals(s1)); //
        System.out.println(s2.equals(s7)); //
        System.out.println(s1.equals(s6)); //
        System.out.println(s4==s1); //
        System.out.println(s2==s7); //
        System.out.println(s8==s5); //
        System.out.println(s1.equalsIgnoreCase(s9)); //
    }
}
