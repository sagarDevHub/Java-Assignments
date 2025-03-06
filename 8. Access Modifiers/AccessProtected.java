class ProtectedExample {
    protected int value = 30;

    protected void show() {
        System.out.println("Protected Method: " + value);
    }
}

class AccessProtected {
    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        System.out.println("Protected Field: " + obj.value);
        obj.show();
    }
}
