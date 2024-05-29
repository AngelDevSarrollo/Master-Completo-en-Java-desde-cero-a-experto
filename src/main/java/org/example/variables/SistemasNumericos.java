package org.example.variables;

public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal= 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        //Pasamos a binario
        System.out.println("numero binario de  = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        //para que el compilador entienda que eso es un numero binario ponemos delante '0b'
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de " + numeroBinario + " = "+ Integer.toOctalString(numeroDecimal));
        //para que el compilador entienda que es un numero octal ponemos un cero '0' delante del numero
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de " + numeroOctal+ " = " + Integer.toHexString(numeroDecimal));
        //para que el compilador entienda que es exadecimal hay que poner delante del numero 0x
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);
        
    }
}
