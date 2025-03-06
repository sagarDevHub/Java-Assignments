class CallInstanceInStatic {
  void instanceMethod() {
      System.out.println("Instance Method Called");
  }

  static void staticMethod() {
      CallInstanceInStatic obj = new CallInstanceInStatic();
      obj.instanceMethod();
  }

  public static void main(String[] args) {
      staticMethod();
  }
}
