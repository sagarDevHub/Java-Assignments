class Parent {
  int value = 20;
}

class Child extends Parent {
  void display() {
      System.out.println("Parent Value: " + super.value);
  }

  public static void main(String[] args) {
      Child obj = new Child();
      obj.display();
  }
}
