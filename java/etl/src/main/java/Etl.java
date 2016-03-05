import java.util.List;
import java.util.Map;
import java.util.Hashtable;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
	Map<String, Integer> map = new Hashtable<>();
	old.entrySet();
	for(Integer point: old.keySet()) {
	    for(String character: old.get(point)) {
		map.put(character.toLowerCase(), point);
	    }
	}
	return map;
    }
}
