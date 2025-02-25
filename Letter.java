public class Letter {
    private char value;
    private boolean revealed = false;

    public Letter(char value) {
        this.value = value;
        if (Character.isWhitespace(value)) {
            revealed = true;
        }
        else if (!Character.isLetter(value)) {
            throw new IllegalArgumentException("Non-letter character detected: " + value);
        }
    }

    public char getValue() {
        if (!revealed) {
            return '_';
        }
        return value;
    }

    public void reveal() {
        revealed = true;
    }

}
