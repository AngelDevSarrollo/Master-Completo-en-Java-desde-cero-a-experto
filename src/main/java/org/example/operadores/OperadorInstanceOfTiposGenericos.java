package org.example.operadores;

public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {
        Object texto = "Creando un objeto de la clase ... que tal!";

        Number num = 7;
        
        Boolean b1 = texto instanceof String;

        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo Objeto = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer= " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number= " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Number= " + b1);

        b1 = num instanceof Long;
        System.out.println("num es del tipo Long = " + b1);

        b1 = num instanceof Double;
        System.out.println("num es del tipo Double = " + b1);


        Number decimal = 45.54;
        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number= " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float= " + b1);
        
        b1 = b1 instanceof Boolean;
        System.out.println("decimal = " + decimal);
    }
}
