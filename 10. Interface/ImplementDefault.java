interface DefaultMethod {
  default void display() {
      System.out.println("Default Method");
  }
}

class ImplementDefault implements DefaultMethod {
  public static void main(String[] args) {
      ImplementDefault obj = new ImplementDefault();
      obj.display();
  }
}
