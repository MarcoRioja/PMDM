package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numMod = 7;
        int numIntro = 0;
        int suma = 0;
        int nextMod = 0;

        System.out.print("Escribe un numero: ");
        numIntro = sc.nextInt();

        if ((numIntro % numMod) != 0) {

            nextMod = (numIntro / numMod);
            nextMod++;
            nextMod = (nextMod * 7);
            suma = (nextMod - numIntro);
        }

        if ((nextMod % numMod) == 0) {
            System.out.print("Valor: " + suma);
        } else {
            System.out.print("No he encontrado nada, comprueba que sea un numero.");
        }

    }
}