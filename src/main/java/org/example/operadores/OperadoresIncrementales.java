package org.example.operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {
        // Operador de pre incremento, primero se incrementa y luego se asigna asi que aqui i vale 2
        int i = 1;
        int j = ++i; // i = i + 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        //Operadores de post incremento, primero se asigna y luego se imcrementa, asi que aqui j tendra el valor de
        // i antes del incremento
        i = 2;
        System.out.println("valor inicial de i = " + i);
        i = j++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        //pre decremento
        i = 3;
        j = --i;// i = i - 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //post decremento
        i = 3;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);
    }
}
