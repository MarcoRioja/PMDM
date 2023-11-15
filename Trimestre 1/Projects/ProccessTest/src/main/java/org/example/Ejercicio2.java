package org.example;

import java.io.IOException;
import java.io.InputStream;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("CMD","/C","tasklist");
        Process p = pb.start();

        InputStream is = p.getInputStream();

        int c;
        while ((c = is.read()) != -1) {
            System.out.print((char) c);
        }
        is.close();

        InputStream isError = p.getErrorStream();
        int cError;
        while ((cError = isError.read()) != -1) {
            System.out.print((char) cError);
        }
        isError.close();
    }
}