package org.example;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una nueva fecha (formato: aaaa-mm-dd): ");
        String nuevaFecha = scanner.nextLine();

        ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DATE");
        Process p = pb.start();

        OutputStream os = p.getOutputStream();
        os.write(nuevaFecha.getBytes());
        os.flush();
        os.close();

        int exitCode = p.waitFor();

        if (exitCode == 0) {
            System.out.println("Fecha cambiada correctamente.");
        } else {
            System.out.println("Error al cambiar la fecha.");
        }
    }
}
