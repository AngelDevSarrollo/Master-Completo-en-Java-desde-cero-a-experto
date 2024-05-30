package org.example.string;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Angel";
        //El metodo .length se usa para ver el tamaño del string
        System.out.println("nombre.length() = " + nombre.length());
        // con el metodo .toUpperCase() pasamos el string a Mayusculas
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        // con el metodo .toLowerCase() pasamos el string a minusculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        //Con el metodo .equals comparamos strings, diferencia entre minusculas y mayusculas
        System.out.println("nombre.equals(\"\") = " + nombre.equals("Angel"));
        System.out.println("nombre.equals(\"\") = " + nombre.equals("angel"));
        //Con el metodo .equalsIgnoreCase podemos hacer que no diferencie entre estas 
        System.out.println("nombre.equals(\"\") = " + nombre.equalsIgnoreCase("angel"));
        //Comparacion lexico grafica (buscar mas informacion)
        System.out.println("nombre.compareTo() = " + nombre.compareTo("Angel"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        //El metodo .charAt me imprime el caracter de la posicion del string que le indique primera posicion 0
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        //.charAt(nombre.length()-1) si juntamos estos -1 nos da la ultima letra del string
        System.out.println("nombre.charAt(0) = " + nombre.charAt(nombre.length()-1));
        //Con el metodo .substring() imprimimos a partir de la posicion que le marquemos del string
        System.out.println("nombre.substring() = " + nombre.substring(1));
        //De este modo podemos acotra lo que queremos que se imprima
        System.out.println("nombre = " + nombre.substring(1,5));
    }
}
