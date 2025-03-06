import java.util.*;

class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(
            "Apple", "Banana", "Cherry", "Date", "Elderberry", 
            "Fig", "Grape", "Honeydew", "Indian Fig", "Jackfruit"
        ));

        list.add("Kiwi");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        list.add(3, "Mango");
        list.remove("Date");
        list.remove(5);
        list.set(2, "Blueberry");

        System.out.println(list.contains("Fig"));
        System.out.println(list.get(4));
        System.out.println(list.size());
        System.out.println(list.contains("Banana"));

        list.clear();
        System.out.println(list);
    }
}
