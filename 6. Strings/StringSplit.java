import java.util.Arrays;

class StringSplit {
    public static void main(String[] args) {
        String s = "apple,banana,grape";
        String[] parts = s.split(",");
        System.out.println(Arrays.toString(parts));
    }
}
