package org.example;

import java.io.*;

public class Ejercicio4 {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("CMD","/C","ping 192.168.0.1");

        File fOut = new File("Salida.txt");
        File fErr = new File("Error.txt");

        pb.redirectOutput(fOut);
        pb.redirectError(fErr);
        pb.start();
    }
}
