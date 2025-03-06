class SubClass extends AbstractExample {
  void abstractMethod() {
      System.out.println("Abstract Method Implemented in SubClass");
  }

  public static void main(String[] args) {
      AbstractExample obj = new SubClass();
      obj.nonAbstractMethod();
  }
}
