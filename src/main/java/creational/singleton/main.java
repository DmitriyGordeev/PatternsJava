package creational.singleton;

public class main {
    public static void main(String[] args) {

        Asgard asgard = Asgard.getInstance();
        asgard = asgard.setInstance("Some Other Instance", 10);
    }
}
