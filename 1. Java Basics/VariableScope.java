class VariableScope {
  int num = 100;

  void display() {
      int num = 50;
      System.out.println(num);
      System.out.println(this.num);
  }

  public static void main(String[] args) {
      VariableScope obj = new VariableScope();
      obj.display();
  }
}