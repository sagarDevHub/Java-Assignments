import java.util.*;
class InsertElement {
  public static int[] insertElement(int[] arr, int index, int value) {
      int[] newArr = new int[arr.length + 1];
      for (int i = 0, j = 0; i < newArr.length; i++)
          newArr[i] = i == index ? value : arr[j++];
      return newArr;
  }

  public static void main(String[] args) {
      int[] arr = {1, 2, 4, 5};
      System.out.println(Arrays.toString(insertElement(arr, 2, 3)));
  }
}
