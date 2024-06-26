package org.example.variables;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        //String numeroStr = scanner.nextLine();
       int numeroDecimal = 0;
       try{
        numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);
       }catch(InputMismatchException e){
           System.out.println("Error debe ingresar un numero entero");
        main(args);
        System.exit(0);
       }
       System.out.println("numeroDecimal = " + numeroDecimal);
        //Pasamos a binario
        String resultadoBinario = "numero binario de  = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        System.out.println("numeroBinario = " + numeroDecimal);
        String resultadoOctal = "numero octal de " + numeroDecimal + " = "+ Integer.toOctalString(numeroDecimal);
        String resultadoHex = "numero hexadecimal de " + numeroDecimal+ " = " + Integer.toHexString(numeroDecimal) ;

        String mensaje = resultadoBinario;
        mensaje += "\n "+ resultadoOctal;
        mensaje += "\n "+resultadoHex;
        System.out.println(mensaje);
        
    }
}
