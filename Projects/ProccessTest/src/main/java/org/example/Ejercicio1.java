package org.example;

import java.io.IOException;
import java.io.InputStream;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("CMD","/C","calc");
        Process p = pb.start();
    }
}
