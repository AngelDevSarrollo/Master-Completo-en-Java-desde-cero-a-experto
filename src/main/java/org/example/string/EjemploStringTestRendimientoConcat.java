package org.example.string;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a", b = "b";
        String c = a;
        StringBuilder sb = new StringBuilder(a);


        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++){
            //c = c.concat(a).concat(b).concat("\n"); //500 =>1ms , 1000 => 2ms, 10000 => 79 ms
            c += a + b + "\n"; //500 =>8ms , 1000 => 10 ms, 10000 => 44
            //sb.append(a).append(b).append("\n");//500 =>0ms , 1000 => 0ms, 10000 => 2ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

    }
}
