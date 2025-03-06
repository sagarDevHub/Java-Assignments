import java.util.*;

class HashMapOperations {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");
        students.put(4, "David");
        students.put(5, "Eve");
        students.put(6, "Frank");
        students.put(7, "Grace");
        students.put(8, "Hannah");
        students.put(9, "Isaac");
        students.put(10, "Jack");

        students.put(11, "Karen");
        System.out.println(students.get(3));

        HashMap<Integer, String> copy = new HashMap<>(students);
        System.out.println(students.containsKey(5));
        System.out.println(students.containsValue("David"));
        System.out.println(students.isEmpty());
        System.out.println(students.size());

        System.out.println(students.keySet());
        System.out.println(students.values());

        students.remove(4);
        HashMap<Integer, String> newMap = new HashMap<>(students);
        System.out.println(newMap);
    }
}
