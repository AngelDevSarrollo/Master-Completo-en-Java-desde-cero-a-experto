package org.example.math;

import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul","amarillo", "verde", "blanco", "negro"};
        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length;

        System.out.println("random = " + random);
        
        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int)random]);


        Random randomObj =  new Random();
        int randomInt = randomObj.nextInt(100);
        System.out.println("randomInt = " + randomInt);
        // ENTRE UNO Y OTRO
        int randomInt2 = 15 + randomObj.nextInt(25 - 15);
        System.out.println("randomInt = " + randomInt2);
        
        long randomLong = randomObj.nextLong();
        System.out.println("randomLong = " + randomLong);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);

        
    }
}
