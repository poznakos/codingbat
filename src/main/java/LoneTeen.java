public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19)) {
            return false;
        }
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19) {
            return true;
        }
        if ((a < 13 || a > 19) && (b < 13 || b > 19)) {
            return false;
        }
        return true;
    }
}