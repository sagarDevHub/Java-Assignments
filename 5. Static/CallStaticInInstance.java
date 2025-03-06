class CallStaticInInstance {
  static void staticMethod() {
      System.out.println("Static Method Called");
  }

  void instanceMethod() {
      staticMethod();
  }

  public static void main(String[] args) {
      CallStaticInInstance obj = new CallStaticInInstance();
      obj.instanceMethod();
  }
}
