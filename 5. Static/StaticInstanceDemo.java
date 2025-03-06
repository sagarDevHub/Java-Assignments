class StaticInstanceDemo {
  static int staticVar1 = 100;
  static int staticVar2 = 200;
  int instanceVar1 = 10;
  int instanceVar2 = 20;

  public static void main(String[] args) {
      System.out.println("StaticVar1: " + staticVar1 + ", StaticVar2: " + staticVar2);
      StaticInstanceDemo obj = new StaticInstanceDemo();
      System.out.println("InstanceVar1: " + obj.instanceVar1 + ", InstanceVar2: " + obj.instanceVar2);
  }
}
