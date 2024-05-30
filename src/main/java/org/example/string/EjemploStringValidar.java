package org.example.string;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo) {
            curso = "Programacion Java";
        }
        boolean esVacio = curso.length() == 0;
        System.out.println(esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if(esBlanco) {
            System.out.println(curso.toUpperCase());
            //el metodo concat solo se utiliza cuando el objeto string tiene una instancia
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }
}
