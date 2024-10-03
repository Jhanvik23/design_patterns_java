package Creational_Pattern.Singleton_Pattern;

public class ConfigTest {
    public static void main(String[] args) {
        ConfigManager configManager = ConfigManager.getInstance();
        System.out.println("Config: " + configManager.getConfig());

        configManager.setConfig("Updated Config");
        System.out.println("Config: " + configManager.getConfig());
    }
}
