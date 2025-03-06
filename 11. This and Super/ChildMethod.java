class ParentMethod {
  void show() {
      System.out.println("Parent Method");
  }
}

class ChildMethod extends ParentMethod {
  void show() {
      super.show();
      System.out.println("Child Method");
  }

  void display() {
      this.show();
  }

  public static void main(String[] args) {
      ChildMethod obj = new ChildMethod();
      obj.display();
  }
}
