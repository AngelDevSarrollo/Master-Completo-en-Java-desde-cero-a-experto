package org.example.operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase ... que tal!";

        Integer num = 7;
        
        Boolean b1 = texto instanceof String;

        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo Objeto = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer= " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number= " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Number= " + b1);

        Double decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number= " + b1);
        
        b1 = b1 instanceof Boolean;
        System.out.println("decimal = " + decimal);
    }
}
