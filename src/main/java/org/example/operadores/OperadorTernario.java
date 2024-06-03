package org.example.operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        String variable = 7 == 5 ? "Si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);
        System.out.println("Nota de matematicas: ");
        matematicas = s.nextDouble();
        System.out.println("Nota de ciencias: ");
        ciencias = s.nextDouble();
        System.out.println("Nota de historia: ");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia)/3;
        estado = promedio >= 5.49 ? "Aprobado" : "Suspendido";
        System.out.println("Estado = " + estado);
        System.out.println("Nota final: " + promedio);
        /*
        if(promedio >= 5.49){
            estado = "Aprobado";
        }else {
            estado = "Rechazado";
            }
         */


    }
}
