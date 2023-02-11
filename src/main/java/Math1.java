import java.util.ArrayList;
import java.util.List;

public class Math1 {
    public List<Integer> math1(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num: nums) {
            result.add((num + 1) * 10 );
        }
        return result;
    }
}

