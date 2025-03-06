import java.util.Arrays;

class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
}
