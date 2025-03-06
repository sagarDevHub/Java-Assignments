class ContainsValue {
  public static boolean containsValue(int[] arr, int value) {
      return FindIndex.findIndex(arr, value) != -1;
  }

  public static void main(String[] args) {
      int[] arr = {5, 10, 15, 20};
      System.out.println(containsValue(arr, 10));
  }
}
