public class DoubleX {
    boolean doubleX(String str) {
        boolean result = false;
        for (int i=0; i< str.length()-1; i++) {
            String letter = str.substring(i, i+1);
            if (letter.equals("x")) {
                String letter2 = str.substring(i+1, i+2);
                if (letter2.equals("x")){
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
