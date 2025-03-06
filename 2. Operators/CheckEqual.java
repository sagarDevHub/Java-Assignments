class CheckEqual {
  static void isEqual(int a, int b) {
      if (a == b) {
          System.out.println("Equal");
      } else {
          System.out.println("Not Equal");
      }
  }

  public static void main(String[] args) {
      isEqual(10, 10);
  }
}