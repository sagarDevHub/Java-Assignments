import java.io.*;
import java.util.Properties;

class ReadPropertiesFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("config.properties");
        Properties prop = new Properties();
        prop.load(fis);
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("password"));
        fis.close();
    }
}
