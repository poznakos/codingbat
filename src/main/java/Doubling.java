import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Doubling {
    public List<Integer> doubling(List<Integer> nums) {
// Rozwiązanie nr 1
        //       nums.replaceAll(liczba -> liczba * 2);
//       return nums;

//    Rozwiązanie nr 2
     return nums.stream().map(n->n*2).collect(Collectors.toList());

    }
}
