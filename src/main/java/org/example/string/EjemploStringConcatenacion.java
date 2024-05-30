package org.example.string;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Andres guzman";
        String detalles = curso + "con el instuctor " + profesor;
        System.out.println(detalles);

        int numeroA = 10, numeroB = 5;
        //si lo primero que encontramos en el parentesis es un string todo se va a comportar como un string y se concatenara
        System.out.println(detalles + numeroA + numeroB);
        //aqui al ser un int primero hara una suma y luego al no poder sumar el detalles lo concatena
        System.out.println(numeroA + numeroB + detalles);
        //Podemos cambiar la preferencia con los parentesis
        //El metodo concat crea otra instancia con los dos strings juntos y se la asigna a la variable detalle2
        String detalle2 = curso.concat(profesor);
        System.out.println("detalle2 = " + detalle2);
        String detalle3 = curso.concat(" ").concat(profesor);
        System.out.println("detalle3 = " + detalle3);
    }
}
