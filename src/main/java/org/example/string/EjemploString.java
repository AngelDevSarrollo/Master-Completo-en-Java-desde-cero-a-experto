package org.example.string;

public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2 = new String("Programacion java");
        //aqui comparamos la referencia
        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);
        //aqui comparamos el texto tal y como son
        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);
        //aui compara los textos pero ignora si son mayusculas o minusculas
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual = " + esIgual);

        String curso3 = "Programacion Java";
        //el programa detecta que es el mismo objeto asi que le asigna la misma referencia pero en distintas variables
        esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual);
    }
}
