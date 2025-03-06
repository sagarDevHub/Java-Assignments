import java.lang.reflect.*;

class NoSuchFieldExample {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<String> obj = String.class;
        Field field = obj.getDeclaredField("unknownField");
    }
}
