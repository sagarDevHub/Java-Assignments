import java.io.*;

class WriteFileUsingBufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"));
        bw.write("BufferedWriter Example");
        bw.close();
    }
}
