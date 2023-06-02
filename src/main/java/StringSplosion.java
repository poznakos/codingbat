public class StringSplosion {
    public String stringSplosion(String str) {
        String result = "";
        for (int i=0; i < str.length(); i++) {
            String str1 = str.substring(0, i+1);
            result = result + str1;
        }
        return result;
    }
}
