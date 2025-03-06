class PrintInstanceInStatic {
  int instanceVar1 = 10;
  int instanceVar2 = 20;

  static void printInstance() {
      PrintInstanceInStatic obj = new PrintInstanceInStatic();
      System.out.println("InstanceVar1: " + obj.instanceVar1 + ", InstanceVar2: " + obj.instanceVar2);
  }

  public static void main(String[] args) {
      printInstance();
  }
}
