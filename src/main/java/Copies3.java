import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {
    public List<String> copies3(List<String> strings) {
//        List<String> resultStrings = new ArrayList<>();

        return strings.stream().map(n->n+n+n).collect(Collectors.toList());
//        for (int i = 0; i < strings.size(); i++){
//            String input = strings.get(i);
//            String output = input+input+input;
//            resultStrings.add(output);
//        }
//
//return resultStrings;
    }
}
