class ConstructorExample {
  ConstructorExample() {
      System.out.println("Default Constructor");
  }

  ConstructorExample(int a) {
      System.out.println("One Argument Constructor: " + a);
  }

  ConstructorExample(int a, int b) {
      System.out.println("Two Argument Constructor: " + a + ", " + b);
  }

  public static void main(String[] args) {
      new ConstructorExample();
      new ConstructorExample(10);
      new ConstructorExample(10, 20);
  }
}
