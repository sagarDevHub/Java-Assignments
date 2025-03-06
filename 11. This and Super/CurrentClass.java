class CurrentClass {
  int value = 10;

  void display() {
      System.out.println("Value: " + this.value);
  }

  public static void main(String[] args) {
      CurrentClass obj = new CurrentClass();
      obj.display();
  }
}
