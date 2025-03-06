import java.util.*;
class CopyArray {
  public static int[] copyArray(int[] arr) {
      int[] newArr = new int[arr.length];
      System.arraycopy(arr, 0, newArr, 0, arr.length);
      return newArr;
  }

  public static void main(String[] args) {
      int[] arr = {1, 2, 3};
      int[] copied = copyArray(arr);
      System.out.println(Arrays.toString(copied));
  }
}
