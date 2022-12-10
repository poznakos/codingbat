import java.util.HashMap;
import java.util.Map;

public class MapBully {

    public Map<String, String> mapBully(Map<String, String> map) {
        Map<String, String> output = new HashMap<>();

        output = map;

        if (map.get("a") == null && map.get("b") == null ){
            return map;
        }

        if(map.get("b") == null){
            map.put("b", "");
        }

        if ( map.get("a") != null && !map.get("a").isEmpty()) {
            output.replace("b", map.get("a"));
            output.replace("a", "");
        }


        return output;
    }
}
