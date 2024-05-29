package org.example.variables;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
       String numeroStr= JOptionPane.showInputDialog(null,"Ingrese un numero entero");
       int numeroDecimal = 0;
       try{
        numeroDecimal = Integer.parseInt(numeroStr);
       }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
        main(args);
        System.exit(0);
       }
                System.out.println("numeroDecimal = " + numeroDecimal);
        //Pasamos a binario
        String resultadoBinario = "numero binario de  = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        //para que el compilador entienda que eso es un numero binario ponemos delante '0b'
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroDecimal);
        String resultadoOctal = "numero octal de " + numeroDecimal + " = "+ Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        //para que el compilador entienda que es un numero octal ponemos un cero '0' delante del numero
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numero hexadecimal de " + numeroDecimal+ " = " + Integer.toHexString(numeroDecimal) ;
        System.out.println(resultadoHex);
        //para que el compilador entienda que es exadecimal hay que poner delante del numero 0x
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);
        String mensaje = resultadoBinario;
        mensaje += "\n "+ resultadoOctal;
        mensaje += "\n "+resultadoHex;
        JOptionPane.showMessageDialog(null, mensaje);
        
    }
}
