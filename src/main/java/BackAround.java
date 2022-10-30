public class BackAround {
    public String backAround(String word) {
        String last;

        last = word.substring(word.length() - 1, word.length());

        return last  + word + last;

    }

}
