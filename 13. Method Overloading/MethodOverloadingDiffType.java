class MethodOverloadingDiffType {
  void show(int a) {
      System.out.println("Integer parameter: " + a);
  }

  void show(double a) {
      System.out.println("Double parameter: " + a);
  }

  public static void main(String[] args) {
      MethodOverloadingDiffType obj = new MethodOverloadingDiffType();
      obj.show(10);
      obj.show(10.5);
  }
}
