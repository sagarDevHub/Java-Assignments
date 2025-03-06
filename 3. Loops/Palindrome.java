class Palindrome {
  static boolean isPalindrome(int num) {
      int rev = 0, temp = num;
      while (temp > 0) {
          rev = rev * 10 + temp % 10;
          temp /= 10;
      }
      return rev == num;
  }

  public static void main(String[] args) {
      System.out.println(isPalindrome(121));
  }
}