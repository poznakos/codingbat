import java.util.List;

public class Fibonacci {

    public int generateSequence(int n) {
        if (n <= 1) {
            return n;
        }
        return generateSequence(n-1) + generateSequence(n-2);
    }
}
