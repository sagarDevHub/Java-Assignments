interface OneMethod {
  void display();
}

class ImplementOneMethod implements OneMethod {
  public void display() {
      System.out.println("Implemented Method");
  }

  public static void main(String[] args) {
      ImplementOneMethod obj = new ImplementOneMethod();
      obj.display();
  }
}
