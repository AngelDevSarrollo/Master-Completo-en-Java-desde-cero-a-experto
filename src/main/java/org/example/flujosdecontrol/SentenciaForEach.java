package org.example.flujosdecontrol;

public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        for(int num: numeros){
            System.out.println("numero = " + num);
        }
        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Pepa", "Lalo", "Bea", "Ana"};

        for(String nombre: nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
