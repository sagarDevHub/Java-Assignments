class ArgumentConstructor {
  ArgumentConstructor() {
      this(50);
  }

  ArgumentConstructor(int x) {
      System.out.println("Value: " + x);
  }

  public static void main(String[] args) {
      new ArgumentConstructor();
  }
}
