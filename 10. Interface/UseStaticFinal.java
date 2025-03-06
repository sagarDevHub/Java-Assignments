interface StaticFinalVariable {
  static final int CONSTANT = 50;
}

class UseStaticFinal implements StaticFinalVariable {
  public static void main(String[] args) {
      System.out.println("Constant Value: " + CONSTANT);
  }
}
