package SetOperations;

import java.util.HashSet;
import java.util.Iterator;

public class UnionIntersection {
    public static void main(String[] args) {
        // Declaring the first hashset, does not maintain the order
        HashSet<Character> set1 = new HashSet<>();
        // Adding the elements
        set1.add('a');
        set1.add('z');

        // Declaring the second hashset
        HashSet<Character> set2 = new HashSet<>();
        // Adding the element
        set2.add('v');
        set2.add('z');
        set2.add('c');

        HashSet<Character> union = getUnion(set1, set2);
        Iterator<Character> itr = union.iterator();

        System.out.print("Union of the sets " + set1 + " and " + set2 + " are: ");
        while(itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }

        System.out.println();

        HashSet<Character> intersection = getIntersection(set1, set2);
        itr = intersection.iterator();

        System.out.print("Intersection of the sets " + set1 + " and " + set2 + " are: ");
        while(itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
    }

    // Method for finding the intersection of two sets
    public static <T> HashSet<T> getIntersection(HashSet<T> set1, HashSet<T> set2) {
        HashSet<T> result = new HashSet<>();

        Iterator<T> itr = set2.iterator();
        while(itr.hasNext()) {
            T elm = itr.next();

            if(set1.contains(elm)) {
                result.add(elm);
            }
        }

        return result;
    }

    // Method for finding the union of two sets
    public static <T> HashSet<T> getUnion(HashSet<T> set1, HashSet<T> set2) {
        HashSet<T> result = new HashSet<>(set1);

        Iterator<T> itr = set2.iterator();
        while(itr.hasNext()) {
            result.add(itr.next());
        }

        return result;
    }
}
