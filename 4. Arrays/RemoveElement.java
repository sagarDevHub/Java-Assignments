import java.util.*;
class RemoveElement {
  public static int[] removeElement(int[] arr, int value) {
      int[] newArr = new int[arr.length - 1];
      int index = 0;
      for (int num : arr)
          if (num != value) newArr[index++] = num;
      return newArr;
  }

  public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      int[] result = removeElement(arr, 3);
      System.out.println(Arrays.toString(result));
  }
}
