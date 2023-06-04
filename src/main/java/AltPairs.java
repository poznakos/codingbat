public class AltPairs {
    public String altPairs(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
         //   i % 4 == 0;
           // (i - 1) % 4 == 0;
            if(i % 4 == 0 || (i - 1) % 4 == 0) {
                result = result + str.substring(i, i+1);
            }
        }
        return result;
    }
}
