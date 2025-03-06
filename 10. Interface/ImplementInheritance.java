interface Parent {
  void parentMethod();
}

interface Child extends Parent {
  void childMethod();
}

class ImplementInheritance implements Child {
  public void parentMethod() {
      System.out.println("Parent Method");
  }

  public void childMethod() {
      System.out.println("Child Method");
  }

  public static void main(String[] args) {
      ImplementInheritance obj = new ImplementInheritance();
      obj.parentMethod();
      obj.childMethod();
  }
}
