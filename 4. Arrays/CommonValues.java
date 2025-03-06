import java.util.*;

class CommonValues {
    public static Set<Integer> commonValues(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>(), common = new HashSet<>();
        for (int num : arr1) set1.add(num);
        for (int num : arr2)
            if (set1.contains(num)) common.add(num);
        return common;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        System.out.println(commonValues(arr1, arr2));
    }
}
