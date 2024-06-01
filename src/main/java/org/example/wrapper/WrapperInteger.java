package org.example.wrapper;

public class WrapperInteger {
    public static void main(String[] args) {
        int intPrimitivo = 32768;
        // estas son las maneras correctas de crear un objeto con un valor int
        Integer intObjeto = Integer.valueOf(32768);
        Integer intObjeto2 = 32768;
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        //Short shortObjeto = 32768; no podriamos hacer esto por que el valor añadido es mayor al que soporta un short
        Short shortObjeto = intObjeto.shortValue(); //Esto no da error pero tenemos una perdida de informacion
        //igualmente nos imprimira un valor muy ambiguo
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);
        
    }
}
