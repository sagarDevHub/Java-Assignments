import java.io.*;

class WriteFileUsingFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("example.txt");
        fw.write("FileWriter Example");
        fw.close();
    }
}
