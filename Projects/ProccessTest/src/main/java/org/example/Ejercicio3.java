package org.example;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        File ruta = new File(".\\bin");

        ProcessBuilder pb = new ProcessBuilder("java","capturarTexto.program");
        pb.directory(ruta);

        Process p;
        p = pb.start();

        InputStream is = p.getInputStream();

        int c;
        while((c = is.read()) != -1) {
            System.out.print((char) c);
        }
        is.close();
    }
}
