public class StringX {
    public String stringX(String str) {
        if(str.length() < 3){
            return str;
        }
        String result = "";
        String middle = "";
        String first = str.substring(0, 1);
        String last = str.substring(str.length() - 1);
        for (int i = 1; i < str.length()-1; i++) {
            String letter = str.substring(i, i+1);
            if (!letter.equals("x")) {
                middle = middle + letter;
            }
        }
        result = first + middle + last;
        return result;

    }
}
