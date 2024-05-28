package org.example.variables;

public class PrimitivosFloat {
    public static void main(String[] args) {
        //2120.0f valor de punto fijo
        //2.12e3f notacion cientifica
        float realFloat = 3.4028235e38f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a = "+ Float.BYTES);
        System.out.println("float corresponde en byte a = "+ Float.SIZE);
        System.out.println("valor maximo de un byte: " + Float.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Float.MIN_VALUE);
        System.out.println("***************---------------***************");

        double realDouble = 1.7976931348623157E308;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a = "+ Double.BYTES);
        System.out.println("double corresponde en byte a = "+ Double.SIZE);
        System.out.println("valor maximo de un byte: " + Double.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Double.MIN_VALUE);
        System.out.println("***************---------------***************");

        var varFlotatnte = 3;
        System.out.println("varFlotatnte = " + varFlotatnte);
        
    }  
    
}
