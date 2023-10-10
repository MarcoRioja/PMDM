import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        byte trys = 6;
        char letter;
        boolean knowLetter;

        String word = "";
        ArrayList knownLetters = new ArrayList<String>();
        ArrayList wordLetters = new ArrayList<String>();
        ArrayList randomWord = new ArrayList<String>();

        //Palabras
        randomWord.add("juan");
        randomWord.add("rosa");
        randomWord.add("arbol");
        randomWord.add("biblioteca");
        randomWord.add("sol");
        randomWord.add("periodico");
        randomWord.add("marco");
        randomWord.add("television");

        //---------\\

        byte selectWord = (byte) rnd.nextInt(0,randomWord.size());
        word = (String) randomWord.get(selectWord);

        for (int i = 0; i < word.length(); i++){
            if (!wordLetters.contains(word.charAt(i))){
                wordLetters.add(word.charAt(i));
            }
        }

        while (trys > 0) {
            System.out.println("");

            if (trys <= 5) System.out.println("  * ");
            if (trys <= 4) System.out.print(" /");
            if (trys <= 3) System.out.print("|");
            if (trys <= 2) System.out.println("\\");
            if (trys <= 1) System.out.print("  /");
            if (trys <= 0) System.out.println("\\");

            System.out.println("");
            if (wordLetters.size() == knownLetters.size()) {
                System.out.println("Has Ganado");
                System.out.println("La Palabra era: " + word);
                trys = -1;
            } else {
                for (int i = 0; i < word.length(); i++) {
                    knowLetter = false;

                    for (int j = 0; j < knownLetters.size(); j++) {
                        if (knownLetters.get(j).equals(word.toLowerCase().charAt(i))) {
                            System.out.print(word.toLowerCase().charAt(i) + " ");
                            knowLetter = true;
                        }
                    }
                    if (!knowLetter) {
                        System.out.print("_ ");
                    }
                }

                System.out.println("\nIntentos = " + trys);
                System.out.print("Escribe una letra: ");
                letter = sc.nextLine().toLowerCase().charAt(0);

                boolean isIn = false;
                for (int i = 0; i < word.length(); i++) {
                    if (word.toLowerCase().charAt(i) == letter) {
                        isIn = true;
                    }
                }
                if (!isIn) {
                    System.out.println("| - La letra " + letter + " no está. - |");
                    --trys;
                } else if (isIn) {
                    System.out.println("| - La letra " + letter + " si está. - |");
                    if (!knownLetters.contains(letter)) {
                        knownLetters.add(letter);
                    }
                }
                System.out.println("----- ----- o ----- -----");
            }

            if (trys == 0) {
                System.out.println("Has Perdido");
            }
        }

    }


}