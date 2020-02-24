import org.junit.Test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static org.junit.Assert.*;

public class PlayerDBTest {
    public ArrayList<Map<String, Object>> db = new ArrayList<>();

    @Test
    public void TestDB() {
        for(int a=0;a<5;a++) {
            Map<String, Object> temp = new HashMap<>();
            temp.put("text", "HELLO");
            temp.put("int", a);
            temp.put("Date", LocalTime.now());
            temp.put("Locale", new Locale("ko","KR"));
            db.add(temp);
        }

        for (Map<String, Object> map : db) {
            System.out.println(((Locale) map.get("Locale")).getDisplayCountry());
        }
    }
}