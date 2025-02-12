package ListOperations;

import java.util.ArrayList;
import java.util.List;

public class RotateList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(8); // 3 4 5 7 8

        rotateList(list, 3); // 7 8 3 4 5

        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
    }

    public static void rotateList(List<Integer> list, int k) {
        k = k % list.size();

        list.addAll(list.subList(0, k));
        while(k-- > 0) {
            list.remove(0);
        }
    }
}
