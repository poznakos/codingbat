public class Last2 {
    public int last2(String str) {
        if(str.length() < 3) {
            return 0;
        }
        int counter = 0;
        String lasttwo = str.substring(str.length()-2);
        for (int i=0; i< str.length()-2; i++) {
            String twoletters = str.substring(i, i+2);
            if (twoletters.equals(lasttwo)) {
                counter++;
            }
        }
        return counter;
    }
}
