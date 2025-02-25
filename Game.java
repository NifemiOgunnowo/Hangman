import java.util.Scanner;

public class Game {
    private int attempts;
    private String wordString;
    private Word word;

    public Game(String word, String difficulty) {
        this.wordString = word;
        this.word = new Word(word);

        switch (difficulty) {
            case "Easy" -> attempts = 10;
            case "Medium" -> attempts = 8;
            case "Hard" -> attempts = 6;
            default -> throw new IllegalArgumentException("Invalid difficulty");
        }

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a letter: ");
            char letter = sc.next().charAt(0);
            check(letter);
            System.out.println("Your word: "+ getWordObject());
            System.out.println("Attempts Left: "+ getAttempts());

            if (getWordObject().equals(word)) {
                System.out.println("Congratulations! You won!");
                System.out.println();
                break;
            }
            if (attempts <= 0) {
                System.out.println("You Lost");
                System.out.println();
                break;
            }
            System.out.println();

        }
    }

    public int getAttempts(){
        return attempts;
    }

    public String getWord(){
        return wordString;
    }

    public String getWordObject(){
        return word.getLetters();
    }

    public void check(char letter){
        word.check(letter);
        if (getWord().toLowerCase().contains(String.valueOf(Character.toLowerCase(letter)))){
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect!");
            attempts--;
        }
    }

}
