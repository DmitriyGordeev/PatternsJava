package creational.singleton;

public class Asgard {

    private static Asgard instance;
    private String data;
    private int citizens;

    private Asgard(String data, int citizens) {
        this.data = data;
        this.citizens = citizens;
    }

    public static Asgard getInstance() {
        if(instance == null) {
            return new Asgard("", 0);
        }
        return instance;
    }

    public static Asgard setInstance(String data, int citizens) {
        instance = new Asgard(data, citizens);
        return instance;
    }
}
