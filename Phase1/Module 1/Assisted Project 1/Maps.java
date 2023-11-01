package Phase1;

import java.util.HashMap;
import java.util.Map;

public class Maps
{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Naresh", 1);
        map.put("Sanjay", 2);
        map.put("Deepti", 3);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
