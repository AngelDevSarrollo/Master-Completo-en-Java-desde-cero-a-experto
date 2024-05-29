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
    }
}
