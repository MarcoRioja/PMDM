package vor.pasapalabra;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    ArrayList<PLetter> roulette;
    byte corrects = 0;
    byte lap = 1;
    Scanner sc = new Scanner(System.in);

    public Game(ArrayList<PLetter> roulette) {
        this.roulette = roulette;
    }

    public void start() {
        while ( lap != 3) {
            if (lap == 2) {System.out.println("\n- Repesca -");}
            for (int i = 0; i < roulette.size(); i++) {
                if (!roulette.get(i).isSuccessBoolean()) {
                    printRoulette();
                    printQuestion((byte) i);
                }
            }
            lap++;
        }

        if (corrects == roulette.size()) {System.out.println("\n | Felicidades Has Ganado! |");}
        else {System.out.println("\n | Los siento Has Perdido |");}

    }

    public void printRoulette() {
        System.out.println("\n");
        for (int i = 0; i < roulette.size(); i++) {
            System.out.print(roulette.get(i).getLetter() + " -> " + roulette.get(i).getSuccessChar() + " | ");
        }
    }

    public void printQuestion(byte question) {
        System.out.print("\n- Con la " + roulette.get(question).getLetter() + " -> " + roulette.get(question).getQuestion() + " -> ");
        String answer = sc.nextLine();
        if (roulette.get(question).getAnswer().equalsIgnoreCase(answer)) {roulette.get(question).setSuccessBoolean(true);corrects++;};
        System.out.print(roulette.get(question).getSuccessChar() + " - La respuesta era: " + roulette.get(question).getAnswer() + "\n");
    }
}
