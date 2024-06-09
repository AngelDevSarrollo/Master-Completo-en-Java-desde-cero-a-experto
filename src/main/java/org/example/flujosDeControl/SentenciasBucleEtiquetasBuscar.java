package org.example.flujosDeControl;

public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "Tres tristes tigres comen trigo en un trigal";
        int max = frase.length();
        int cantidad = 0;
        char letra = 'g';
        for (int i = 0; i < max; i++){
            if(frase.charAt(i) != letra){
                continue;
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + " veces el caracter '"+ letra + "' en la frase");
        System.out.println("===========================================================================");

        String frase1 = "Tres tristes tigres comen trigo en un trigal";
        String palabra = "trigo";

        int maxFrase = frase1.length();
        int maxPalabra = palabra.length();
        int cantidad2 = 0;
        char letra1 = 'g';
        buscar:
        for (int i = 0; i < maxFrase; i++){
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {

                if (frase1.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad2++;
        }
        System.out.println("Encontrado = " + cantidad2 + " veces la palabra '"+ palabra + "' en la frase");
    }

}
