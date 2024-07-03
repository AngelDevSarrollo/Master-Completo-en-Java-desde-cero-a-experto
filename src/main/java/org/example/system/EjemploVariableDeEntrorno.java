package org.example.system;

import java.util.Map;

public class EjemploVariableDeEntrorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("Variable de ambiente del sistema = " + varEnv);

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOMR");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);

        String appEnv = varEnv.get("APPLICATION_ENV");
        System.out.println("appEnv = " + appEnv);
    }
}
