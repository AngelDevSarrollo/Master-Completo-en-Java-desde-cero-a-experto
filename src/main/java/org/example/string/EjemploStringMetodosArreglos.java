package org.example.string;

public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        //El metodo .toCharArray() conviierte el string en un array de caracteres de tipo char
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        //
        char[] arreglo = trabalenguas.toCharArray();
        //el metodo .length retorna la cantidad de elementos
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for(int i = 0; i < largo; i++){
            System.out.println(arreglo[i]);
        }
        // con el metodo .split dividimos el arreglo por la letra a en este caso tr, b, lengu, s
        System.out.println("trabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for (int j = 0; j<l; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.jpg";
        String[] archivoArr = archivo.split("\\.");
        l = archivoArr.length;
        for (int j = 0; j<l; j++){
            System.out.println(archivoArr[j]);
        }
        System.out.println("extension = " + archivoArr[l-1]);

        
    }
}
