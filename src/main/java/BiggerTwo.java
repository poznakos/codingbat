public class BiggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        if (sumA < sumB) {
            return b;
        }
        if (sumA > sumB) {
            return a;
        }
        return a;
    }
}