class AverageArray {
  public static double averageArray(int[] arr) {
      return (double) SumArray.sumArray(arr) / arr.length;
  }

  public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      System.out.println(averageArray(arr));
  }
}
