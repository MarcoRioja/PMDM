package vor.pasapalabra;

import java.util.ArrayList;

public class PLetter {
    private char letter;
    private String question;
    private boolean successBoolean;
    private String answer;
    private char successChar;

    public PLetter(char nLetter, String nQuestion, String nAnswer) {
        this.letter = nLetter;
        this.question = nQuestion;
        this.answer = nAnswer;

        setSuccessBoolean(false);
    }


    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isSuccessBoolean() {
        return successBoolean;
    }

    public void setSuccessBoolean(boolean successBoolean) {
        this.successBoolean = successBoolean;

        if (!successBoolean) {setSuccessChar('✘');}
        else if (successBoolean) {setSuccessChar('✔');}
    }

    public char getSuccessChar() {
        return successChar;
    }

    public void setSuccessChar(char successChar) {
        this.successChar = successChar;
    }
}
