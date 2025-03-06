class SubClassAbstract extends AbstractExample {
  void abstractMethod() {
      System.out.println("Abstract Method Implemented");
  }

  public static void main(String[] args) {
      SubClassAbstract obj = new SubClassAbstract();
      obj.abstractMethod();
  }
}
