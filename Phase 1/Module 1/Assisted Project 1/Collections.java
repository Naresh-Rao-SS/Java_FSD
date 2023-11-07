package Phase1;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Item No 1");
        list.add("Item No 2");
        list.add("Item No 3");

        for (String itemno : list) {
            System.out.println(itemno);
            
        }
    }
}
