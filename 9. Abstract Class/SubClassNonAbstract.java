class SubClassNonAbstract extends AbstractExample {
  void abstractMethod() {
      System.out.println("Abstract Method Implemented");
  }

  public static void main(String[] args) {
      SubClassNonAbstract obj = new SubClassNonAbstract();
      obj.nonAbstractMethod();
  }
}
