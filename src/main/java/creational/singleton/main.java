package creational.singleton;

public class main {
    public static void main(String[] args) {

        AppSettings settings = AppSettings.getInstance();
        settings = settings.setInstance("SingleTonExample", 10);
    }
}
