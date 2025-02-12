package ListOperations;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindNthElement {
    public static void main(String[] args) {
        // Linked list declaration
        List<Integer> list = new LinkedList<>();
        // Adding the element
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // Declare the nth index of element that needs to be retrieved
        int n = 4;
        // Method calling
        int index = findNthElement(list, n);
        // Printing the result
        System.out.println("Element from last " + n + "th index is: " + list.get(index));
    }

    // Method declaration
    public static <T> int findNthElement(List<T> list, int n) {
        // Iterator for tracking the last nth element
        int curr = 0;

        // Iterator on the list
        Iterator<T> itr = list.iterator();
        // Moving the iterator n ahead
        while(n-- > 0) {
            itr.next();
        }

        // Iterate until the end is reached and increase the current iterator at the same time
        while(itr.hasNext()) {
            itr.next();
            curr++;
        }

        // Return the index of the element
        return curr;
    }
}
