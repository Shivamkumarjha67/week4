package ListOperations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatePreservingOrder {
    public static void main(String[] args) {
        // List declaration and initialization
        List<Integer> list = new ArrayList<>();
        // Adding the element
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);

        // Method invocation for removing the duplicate
        removeDuplicate(list);

        // Printing
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
    }

    // Method definition
    public static void removeDuplicate(List<Integer> list) {
        // Hashset declaration for storing the unique element
        HashSet<Integer> occurred = new HashSet<>();

        // Iterating and removing the already present element from list
        for(int i=0; i<list.size(); i++) {
            if(occurred.contains(list.get(i))) {
                list.remove(i);
                i--;
            } else occurred.add(list.get(i));
        }
    }
}
