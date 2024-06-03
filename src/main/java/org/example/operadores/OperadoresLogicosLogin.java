package org.example.operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String[] username ={ "angel", "carlos", "admin"};
        String[] password = {"12345", "123", "2345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username: ");
        String usuario = scanner.nextLine();

        System.out.println("Ingrese el password: ");
        String p= scanner.nextLine();

        boolean esAutenticado = false;

        for(int i = 0; i< username.length; i++){
            if( (username[i].equals(usuario) && password[i].equals(p)) ){
                esAutenticado = true;
                break;
            }
        }

        if(esAutenticado){
            esAutenticado =true;
        }
        if (esAutenticado == true){
            System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));
        }else {
            System.out.println("Usuario o contraseña no valido");

        }
    }
}
