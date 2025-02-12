package SetOperations;

import java.util.HashSet;

public class EqualSets {
    public static void main(String[] args) {
        // Declaring the first hashset, does not maintain the order
        HashSet<Character> set1 = new HashSet<>();
        // Adding the elements
        set1.add('a');
        set1.add('z');
        set1.add('f');

        // Declaring the second hashset
        HashSet<Character> set2 = new HashSet<>();
        // Adding the element
        set2.add('z');
        set2.add('f');
        set2.add('c');

        // Printing the result of either the set is equal or not
        System.out.println("Is both set are equal or not?: " + set1.equals(set2));
    }
}
