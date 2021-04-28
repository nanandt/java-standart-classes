package rizky.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try{

            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties")); // load data properties

            String host = properties.getProperty("database.host");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(username);
            System.out.println(password);

        } catch (FileNotFoundException exception){
            System.out.println("File nya mana bjiir");
        } catch (IOException exception){
            System.out.println("gagal load data");
        }

        try {
            Properties properties = new Properties();
            properties.put("first.name","jaka"); // put membuat propeties
            properties.put("last.name","tingkir");

            properties.store(new FileOutputStream("name.properties"), "");
        } catch (FileNotFoundException exception){
            System.out.println("error membuat file properties");
        } catch (IOException exception){
            System.out.println("error nyimpen properties");
        }


    }
}
