import java.util.ArrayList;
import java.util.Map;

public class PlayerDB {
    public ArrayList<Map<String, Object>> db = new ArrayList<>();

    public boolean insert(String uuid, String name, Object key) {
        for(Map<String, Object> d : db){
            if(d.get("uuid").equals(uuid)){
                d.put(name, key);
                return true;
            }
        }
        return false;
    }
}