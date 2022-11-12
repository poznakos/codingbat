public class Start1 {
    public int start1(int[] a, int[] b) {

        int a0 = a.length > 0 && a[0] == 1 ? 1 : 0;
        int b0 = b.length > 0 && b[0] == 1 ? 1 : 0;
        int result = a0 + b0;
        return result;
    }
}
