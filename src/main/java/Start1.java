public class Start1 {
    public int start1(int[] a, int[] b) {
        if(a[0] == 1 && b[0] == 1){
            return 2;
        }
        if(a[0] != 1 && b[0] != 1){
            return 0;
        }
        if(a[0] == 1 || b[0] == 1){
            return 1;
        }
        return 0;
    }
}
