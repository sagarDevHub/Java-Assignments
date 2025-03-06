interface TwoMethods {
  void method1();
  void method2();
}

class ImplementOne implements TwoMethods {
  public void method1() {
      System.out.println("Implemented method1");
  }

  public static void main(String[] args) {
      ImplementOne obj = new ImplementOne();
      obj.method1();
  }

  @Override
  public void method2() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'method2'");
  }
}
