class PrintStaticInInstance {
  static int staticVar1 = 100;
  static int staticVar2 = 200;

  void printStatic() {
      System.out.println("StaticVar1: " + staticVar1 + ", StaticVar2: " + staticVar2);
  }

  public static void main(String[] args) {
      PrintStaticInInstance obj = new PrintStaticInInstance();
      obj.printStatic();
  }
}
