import java.util.*;

class HashSetOperations {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList(
            "Apple", "Banana", "Cherry", "Date", "Elderberry", 
            "Fig", "Grape", "Honeydew", "Indian Fig", "Jackfruit"
        ));

        set.add("Kiwi");
        set.remove("Date");
        System.out.println(set.contains("Fig"));
        System.out.println(set.size());

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        set.clear();
        System.out.println(set.isEmpty());
    }
}
