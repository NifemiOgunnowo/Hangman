public class Word {
    private Letter[] letters;
    private String word;
    public Word(String word) {
        this.word = word;
        letters = new Letter[word.length()];
        for (int i = 0; i < word.length(); i++) {
            letters[i] = new Letter(word.charAt(i));
        }
    }

    public String getLetters() {
        char[] chars = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            chars[i] = letters[i].getValue();
        }
        return new String(chars);
    }

    public void check(char c) {
        for (int i = 0; i < letters.length; i++) {
            if (Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(c)){
                letters[i].reveal();
            }
        }
    }





}
