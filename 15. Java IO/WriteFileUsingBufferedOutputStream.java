import java.io.*;

class WriteFileUsingBufferedOutputStream {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("example.txt"));
        String text = "Buffered OutputStream Example";
        bos.write(text.getBytes());
        bos.close();
    }
}
