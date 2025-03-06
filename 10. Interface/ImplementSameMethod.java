interface FirstSame {
  void show();
}

interface SecondSame {
  void show();
}

class ImplementSameMethod implements FirstSame, SecondSame {
  public void show() {
      System.out.println("Method Implemented");
  }

  public static void main(String[] args) {
      ImplementSameMethod obj = new ImplementSameMethod();
      obj.show();
  }
}
