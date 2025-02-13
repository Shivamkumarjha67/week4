import ListOperations.ReverseList;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Testing {
    @Disabled
    @Test
    void testListReversal() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ReverseList.reverseList(list);
        assertEquals("[3, 2, 1]", list.toString());
    }

    @Test
    void testOccurance() {
        List<String> list = new ArrayList<>();
        list.add("Raj");
        list.add("Gajak");
        list.add("Raj");

        HashMap<String, Integer> frequency = new HashMap<>();

        for(String str : list) {
            frequency.put(str, frequency.getOrDefault(str, 0) + 1);
        }

        assertEquals("{Raj=2, Gajak=1}", frequency.toString());
    }
}
