package creational.singleton;

/**
 * Singleton pattern example
 */
public class AppSettings {

    private static volatile AppSettings instance;
    private String appName;
    private int someConfigInteger;

    private AppSettings(String appName, int someConfigInteger) {
        this.appName = appName;
        this.someConfigInteger = someConfigInteger;
    }

    public static AppSettings getInstance() {
        if(instance == null) {
            synchronized (AppSettings.class) {
                instance = new AppSettings("Default", 0);
            }
        }
        return instance;
    }

    public static AppSettings setInstance(String appName, int someConfigInteger) {
        instance = new AppSettings(appName, someConfigInteger);
        return instance;
    }
}
