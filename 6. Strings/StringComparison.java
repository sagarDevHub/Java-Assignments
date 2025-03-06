class StringComparison {
  public static void main(String[] args) {
      String s1 = "Hello";
      String s2 = "hello";
      System.out.println(s1.equalsIgnoreCase(s2));
      System.out.println(s1.startsWith("He"));
      System.out.println(s1.endsWith("lo"));
      System.out.println(s1.compareTo(s2));
  }
}
