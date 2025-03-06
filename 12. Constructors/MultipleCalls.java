class MultipleCalls {
  MultipleCalls() {
      System.out.println("Constructor Called");
  }

  void callConstructor() {
      // this.MultipleCalls(); // Not possible
      new MultipleCalls(); // Creates a new object, but does not recall constructor on the same object
  }

  public static void main(String[] args) {
      MultipleCalls obj = new MultipleCalls();
      obj.callConstructor();
  }
}
