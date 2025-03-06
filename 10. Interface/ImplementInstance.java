interface InterfaceInstance {
  void show();
}

class ImplementInstance implements InterfaceInstance {
  public void show() {
      System.out.println("Interface method implemented");
  }

  public static void main(String[] args) {
      InterfaceInstance obj = new ImplementInstance();
      obj.show();
  }
}
