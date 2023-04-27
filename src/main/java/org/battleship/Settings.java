package org.battleship;

import java.io.IOException;
import java.util.Properties;

public class Settings extends BasicSettings {
    private final Properties properties = new Properties();

    public static final String DEFAULT_FILE_PATH = System.getProperty("user.home") + "/battleship_server_settings.json";

    public Settings() {
        try {
            this.properties.load(getClass().getClassLoader().getResourceAsStream("program.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getProgramVersion() {
        return this.properties.getProperty("version");
    }

}
