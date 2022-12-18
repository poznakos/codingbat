public class LoneSum {
    public int loneSum(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        }
        if (a == c) {
            return b;
        }
        if(b == c ){
            return a;
        }
        if(a == b){
            return c;
        }
        return a + b + c;

    }
}
