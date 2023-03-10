package class31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo2 {
    public static void main(String[] args) throws IOException {
        String path="Files/test2.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.setProperty("User Name","Jack Daniels");
        properties.setProperty("Password","GetResponsivelyHammered");
        properties.store(fileOutputStream,"A new user name and password have been added");
    }
}
