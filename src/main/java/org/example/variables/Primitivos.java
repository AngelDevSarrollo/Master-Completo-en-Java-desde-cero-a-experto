package org.example.variables;

public class Primitivos {
    public static void main(String[] args) {
        byte numeroByte = 12;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en byte a " + Byte.SIZE);
        System.out.println("valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Byte.MIN_VALUE);
        System.out.println("***************---------------***************");

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo Short corresponde en Short a " + Short.BYTES);
        System.out.println("tipo Short corresponde en Short a " + Short.SIZE);
        System.out.println("valor maximo de un Short: " + Short.MAX_VALUE);
        System.out.println("valor minimo de un Short: " + Short.MIN_VALUE);
        System.out.println("***************---------------***************");

        int numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo Int corresponde en Short a " + Integer.BYTES);
        System.out.println("tipo Int corresponde en Short a " + Integer.SIZE);
        System.out.println("valor maximo de un Int: " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un Int: " + Integer.MIN_VALUE);
        System.out.println("***************---------------***************");

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo Long corresponde en Short a " + Long.BYTES);
        System.out.println("tipo Long corresponde en Short a " + Long.SIZE);
        System.out.println("valor maximo de un Long: " + Long.MAX_VALUE);
        System.out.println("valor minimo de un Long: " + Long.MIN_VALUE);
        System.out.println("***************---------------***************");

        var numeroVar =1;
        System.out.println("numeroVar = " + numeroVar);

    }
}
