class CallMethodsInMain {
  static void staticMethod() {
      System.out.println("Static Method Called");
  }

  void instanceMethod() {
      System.out.println("Instance Method Called");
  }

  public static void main(String[] args) {
      CallMethodsInMain obj = new CallMethodsInMain();
      staticMethod();
      obj.instanceMethod();
  }
}
