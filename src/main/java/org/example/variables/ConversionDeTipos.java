package org.example.variables;

public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";
        //String a entero
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        //String a double
        String realStr = "98765.43e-13";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        //String a booleano
        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
        //de int a string
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt);

        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);

        otroRealStr = String.valueOf(1.2345e6f);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 10000;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char c = (char) i;
        System.out.println("c = " + c);
        float f = (float)i;
        System.out.println("f = " + f);
        

    }
}
