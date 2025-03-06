import java.util.*;

class FindDuplicates {
    public static Set<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>(), duplicates = new HashSet<>();
        for (int num : arr)
            if (!seen.add(num)) duplicates.add(num);
        return duplicates;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        System.out.println(findDuplicates(arr));
    }
}
