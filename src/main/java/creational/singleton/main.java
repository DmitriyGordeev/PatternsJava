package creational.singleton;

public class main {
    public static void main(String[] args) {

        AppSettings asgard = AppSettings.getInstance();
        asgard = asgard.setInstance("SingleTonExample", 10);
    }
}
