public class CatDog {
    public boolean catDog(String str) {
        int catcount = 0;
        int dogcount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String word = str.substring(i, i + 3);
            if (word.equals("cat")) {
                // to samo co catcount = catcount + 1
                catcount++;
            }
            if (word.equals("dog")) {
                // to samo co catcount = catcount + 1
                dogcount++;
            }
        }
        return catcount == dogcount;
    }
}
