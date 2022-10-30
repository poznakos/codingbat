public class StartHi {
    public boolean startHi(String word) {
        if (word.length() < 2) {
            return false;
        }
        if (word.substring(0, 2).equals("hi")) {
            return true;
        }
        return false;
    }
}
