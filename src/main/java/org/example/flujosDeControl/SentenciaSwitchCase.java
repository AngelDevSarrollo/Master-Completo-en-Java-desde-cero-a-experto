package org.example.flujosDeControl;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        byte num = 1;
        switch(num){
            case 0:
                System.out.println("El numeros es cero");
                break;
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                break;
            default:
                System.out.println("Numero desconocido");
        }
        String nombre = "Angel";
        switch (nombre){
            case "admin":
                System.out.println("Hola admin, bienvenido!");
                break;
            case  "Angel":
                System.out.println("Hola Angel!");
                break;
            case "Pepe":
                System.out.println("Hola Pepe!");
            default:
                System.out.println("Usuario desconocido");
        }
    }
}
