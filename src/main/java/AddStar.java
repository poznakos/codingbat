import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddStar {
    public List<String> addStar(List<String> strings) {
        return strings.stream().map(n->n+"*").collect(Collectors.toList());
    }
}