class StringCreation {
  public static void main(String[] args) {
      String s1 = "Hello";
      String s2 = new String("World");
      char[] chars = {'J', 'a', 'v', 'a'};
      String s3 = new String(chars);
      System.out.println(s1 + " " + s2 + " " + s3);
  }
}
