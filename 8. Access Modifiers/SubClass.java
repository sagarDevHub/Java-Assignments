class PrivateExample {
  private int value = 10;

  private void display() {
      System.out.println("Private Method: " + value);
  }

  public static void main(String[] args) {
      PrivateExample obj = new PrivateExample();
      System.out.println("Private Field: " + obj.value);
      obj.display();
  }
}

class SubClass extends PrivateExample {
  public static void main(String[] args) {
      SubClass obj = new SubClass();
      // System.out.println(obj.value); // Not accessible
      // obj.display(); // Not accessible
  }
}
