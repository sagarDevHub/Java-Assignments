public interface PublicInterface {
  int value = 100;
  void show();
}

class ImplementPublicInterface implements PublicInterface {
  public void show() {
      System.out.println("Value: " + value);
  }

  public static void main(String[] args) {
      ImplementPublicInterface obj = new ImplementPublicInterface();
      obj.show();
  }
}
