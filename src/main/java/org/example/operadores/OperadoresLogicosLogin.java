package org.example.operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String username = "angel";
        String password = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username: ");
        String usuario = scanner.nextLine();

        System.out.println("Ingrese el password: ");
        String p= scanner.nextLine();

        boolean esAutenticado = false;

        if(username.equals(usuario) && password.equals(p)){
            esAutenticado =true;
        }
        if (esAutenticado == true){
            System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));
        }else {
            System.out.println("Usuario o contraseña no valido");

        }
    }
}
