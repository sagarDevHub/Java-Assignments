
class DefaultExample {
    int value = 20;

    void show() {
        System.out.println("Default Method: " + value);
    }
}

class AccessDefault {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        System.out.println("Default Field: " + obj.value);
        obj.show();
    }
}
