package ReviewClass10Asghar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {
    public static void main(String[] args) {
        String path="Files/config.properties2";
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            Properties properties=new Properties();
            properties.load(fileInputStream);

            System.out.println(properties.getProperty("userName"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
