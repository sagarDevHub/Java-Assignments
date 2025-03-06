import java.lang.reflect.*;

class NoSuchMethodExample {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<String> obj = String.class;
        Method method = obj.getDeclaredMethod("unknownMethod");
    }
}
