package ListOperations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ReverseList class for operating over the list(e.g. Linkedlist and Arraylist)
public class ReverseList {
    // Main method
    public static void main(String[] args) {
        // ArrayList declaration
        List<Integer> arrayList = new ArrayList<>();
        // Adding the element to the list
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        System.out.println(arrayList);
        // Printing
        printList(arrayList);
        reverseList(arrayList); // Reversing
        System.out.print("Printing after the reversing the list: ");
        printList(arrayList); // Printing after reversing

        // Linkedlist declaration and initialization
        List<Integer> linkedList = new LinkedList<>();
        // Adding the elements
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(2);
        linkedList.add(4);

        // Printing
        printList(linkedList);
        reverseList(linkedList); // Reversing the list
        System.out.print("Printing after the reversing the list: ");
        printList(linkedList); // Printing
    }

    // Method for printing the list
    public static void printList(List<Integer> list) {
        // Iterating and printing each element
        for(Integer element : list) {
            System.out.print(element + ", ");
        }

        System.out.println();
    }

    // Method for reversing the list
    public static void reverseList(List<Integer> list) {
        int size = list.size();

        // Iterating the half of the list and reversing the corresponding the elements
        for(int i=0; i<size/2; i++) {
            Integer temp = list.get(i);
            list.set(i, list.get(size - 1 - i)); // setting element at the given index
            list.set(size - 1 - i, temp);
        }
    }
}
