public class StringYak {
    public String stringYak(String str) {
        String result = "";
        String whithaoutYak = str;
        for (int i = 0; i < whithaoutYak.length()-2; i++) {
            String text = whithaoutYak.substring(i, i+3);
            if(text.equals("yak")){
                String first = whithaoutYak.substring(0, i);
                String last = whithaoutYak.substring(i+3, whithaoutYak.length());
                whithaoutYak = first + last;
            }
        }
        return whithaoutYak;
    }
}
