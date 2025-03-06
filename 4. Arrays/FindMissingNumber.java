class FindMissingNumber {
  public static int findMissingNumber(int[] arr) {
      int expectedSum = 5050, actualSum = 0;
      for (int num : arr) actualSum += num;
      return expectedSum - actualSum;
  }

  public static void main(String[] args) {
      int[] arr = new int[99];
      for (int i = 0, j = 1; i < 99; j++) if (j != 50) arr[i++] = j;
      System.out.println(findMissingNumber(arr));
  }
}
