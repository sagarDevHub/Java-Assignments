import java.util.*;
class MinMax {
  public static int[] minMax(int[] arr) {
      int min = arr[0], max = arr[0];
      for (int num : arr) {
          if (num < min) min = num;
          if (num > max) max = num;
      }
      return new int[]{min, max};
  }

  public static void main(String[] args) {
      int[] arr = {3, 1, 4, 5, 2};
      System.out.println(Arrays.toString(minMax(arr)));
  }
}
