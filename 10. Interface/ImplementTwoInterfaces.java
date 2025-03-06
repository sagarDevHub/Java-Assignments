interface First {
  void firstMethod();
}

interface Second {
  void secondMethod();
}

class ImplementTwoInterfaces implements First, Second {
  public void firstMethod() {
      System.out.println("First Method Implemented");
  }

  public void secondMethod() {
      System.out.println("Second Method Implemented");
  }

  public static void main(String[] args) {
      ImplementTwoInterfaces obj = new ImplementTwoInterfaces();
      obj.firstMethod();
      obj.secondMethod();
  }
}
