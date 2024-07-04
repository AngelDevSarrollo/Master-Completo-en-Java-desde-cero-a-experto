package org.example.valorvsreferencia;

public class PasarPorValor {
    public static void main(String[] args) {
        //Todas las variables primitivas se pasan por valor, y no por referencia por que no es un objeto
         int i = 10;
        System.out.println("iniciamos el método main con i = " + i);
        test(i);
        System.out.println("Finaliza el metodo main con el valor de i = " + i);

    }
    public static void test(int i){
        System.out.println("Iniciamos el metodo test con i = " + i);
        i = 35;
        System.out.println("Finaliza el metodo test con i = " + i);
    }
}
