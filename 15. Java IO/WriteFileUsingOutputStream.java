import java.io.*;

class WriteFileUsingOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("example.txt");
        String text = "Hello, this is a test.";
        fos.write(text.getBytes());
        fos.close();
    }
}
