package org.example.variables;

public class IntroduccionALasVariables {
    public static void main(String[] args) {
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar = " + saludar.toUpperCase());

        int numero = 10;
        int numero2 = 5;
        System.out.println("numero = " + numero);
        boolean valor = true;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = "15";
    }
}
