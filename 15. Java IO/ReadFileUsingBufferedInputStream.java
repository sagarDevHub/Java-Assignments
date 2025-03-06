import java.io.*;

class ReadFileUsingBufferedInputStream {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("example.txt"));
        int i;
        while ((i = bis.read()) != -1) {
            System.out.print((char) i);
        }
        bis.close();
    }
}
