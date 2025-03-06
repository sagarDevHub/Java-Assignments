class ArmstrongNumber {
  static boolean isArmstrong(int num) {
      int sum = 0, temp = num, digits = String.valueOf(num).length();
      while (temp > 0) {
          sum += Math.pow(temp % 10, digits);
          temp /= 10;
      }
      return sum == num;
  }

  public static void main(String[] args) {
      System.out.println(isArmstrong(153));
  }
}