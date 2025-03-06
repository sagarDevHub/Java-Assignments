import java.io.*;

class ReadFileUsingInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("example.txt");
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
    }
}
