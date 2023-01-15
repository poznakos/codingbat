import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Square {
    public List<Integer> square(List<Integer> nums) {
        return nums.stream().map(n->n*n).collect(Collectors.toList());
    }
}
