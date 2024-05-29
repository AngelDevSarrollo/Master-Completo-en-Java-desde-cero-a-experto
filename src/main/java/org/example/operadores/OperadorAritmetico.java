package org.example.operadores;

import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);
        //si lo ponemos asi concatena, no hace la operacion aritmetica, en este caso se comporta como un string
        System.out.println("i + j = " + i + j);
        //En este caso, primero hace la operacion aritmetica, y luego como no puede sumar el string lo concatena
        System.out.println(i + j+ "i + j = ");
        //Si añadimos parentesis cambiamos la prioridad de las operaciones
        System.out.println("i + j = " + (i + j));
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        //esta operacion no es posible porque el string no reconoce el operador menos, tendriamos que usar parentesis
        //System.out.println("i - j = " + i - j);
        
        int multi = i * j;
        System.out.println("multi = " + multi);
        int div = i/j;
        float div2 = (float) i/j;
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);
        
        int resto = i%j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if(numero % 2 == 0){
            System.out.println("El numero es par = " + numero);
        } else {
            System.out.println("El numero es impar = " + numero);
        }
    }
}
