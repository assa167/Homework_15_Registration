package company.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    public static Properties loadProperties(String prorertyFile) {
        Properties config = new Properties();
        InputStream input;
        try {
            input = new FileInputStream(prorertyFile);
            config.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return config;
    }
}
