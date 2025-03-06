class Parent {
  Parent() {
      System.out.println("Parent Default Constructor");
  }

  Parent(int a) {
      System.out.println("Parent Argument Constructor: " + a);
  }
}

class Child extends Parent {
  Child() {
      super();
      System.out.println("Child Default Constructor");
  }

  Child(int a) {
      super(a);
      System.out.println("Child Argument Constructor");
  }

  public static void main(String[] args) {
      new Child();
      new Child(50);
  }
}
