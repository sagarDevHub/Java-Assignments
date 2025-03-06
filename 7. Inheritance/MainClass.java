class A {
  int x = 10;

  void methodA1() {
      System.out.println("Method A1");
  }

  void methodA2() {
      System.out.println("Method A2");
  }

  void overrideMethod() {
      System.out.println("Override Method in A");
  }
}

class B extends A {
  int x = 20;

  void methodB1() {
      System.out.println("Method B1");
  }

  void methodB2() {
      System.out.println("Method B2");
  }

  void overrideMethod() {
      System.out.println("Override Method in B");
  }
}

class C extends B {
  int x = 30;

  void methodC1() {
      System.out.println("Method C1");
  }

  void methodC2() {
      System.out.println("Method C2");
  }

  void overrideMethod() {
      System.out.println("Override Method in C");
  }
}

class MainClass {
  public static void main(String[] args) {
      A objA = new A();
      B objB = new B();
      C objC = new C();

      objA.methodA1();
      objA.methodA2();
      objA.overrideMethod();

      objB.methodA1();
      objB.methodA2();
      objB.methodB1();
      objB.methodB2();
      objB.overrideMethod();

      objC.methodA1();
      objC.methodA2();
      objC.methodB1();
      objC.methodB2();
      objC.methodC1();
      objC.methodC2();
      objC.overrideMethod();

      A refB = new B();
      A refC = new C();

      refB.overrideMethod();
      refC.overrideMethod();

      System.out.println("A's x: " + objA.x);
      System.out.println("B's x: " + objB.x);
      System.out.println("C's x: " + objC.x);

      System.out.println("Ref to B's x: " + refB.x);
      System.out.println("Ref to C's x: " + refC.x);
  }
}
