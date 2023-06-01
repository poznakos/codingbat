public class FrontTimes {
    public String frontTimes(String str, int n) {
        String firstletters = "";
        String result = "";
        if (str.length()<4 ) {
            firstletters = str;
        } else
            firstletters = str.substring(0, 3);
        for (int i=0; i<n; i++) {
            result = result + firstletters;
        }
            return result;
    }

}
