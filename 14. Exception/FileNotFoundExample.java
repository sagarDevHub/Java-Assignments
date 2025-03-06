import java.io.*;

class FileNotFoundExample {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader file = new FileReader("nonexistent.txt");
    }
}
