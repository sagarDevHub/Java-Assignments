class ConstructorExample {
  ConstructorExample() {
      this(100);
      System.out.println("Default Constructor");
  }

  ConstructorExample(int x) {
      System.out.println("Parameterized Constructor: " + x);
  }

  public static void main(String[] args) {
      new ConstructorExample();
  }
}
