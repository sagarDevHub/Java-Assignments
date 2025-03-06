class AccessModifiers {
  private AccessModifiers() {
      System.out.println("Private Constructor");
  }

  protected AccessModifiers(int a) {
      System.out.println("Protected Constructor: " + a);
  }

  public AccessModifiers(String s) {
      System.out.println("Public Constructor: " + s);
  }

  AccessModifiers(double d) {
      System.out.println("Default Constructor: " + d);
  }

  public static void main(String[] args) {
      // new AccessModifiers(); // Private constructor cannot be accessed
      new AccessModifiers(10);
      new AccessModifiers("Hello");
      new AccessModifiers(5.5);
  }
}
