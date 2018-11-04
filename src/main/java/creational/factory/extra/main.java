package creational.factory.extra;

public class main {
    public static void main(String[] args) {

        RocketFactory rocketFactory = new RocketFactory();
        rocketFactory.setDestination("Moon");
        rocketFactory.setLaunchStartTime("18:00");
        rocketFactory.setManufacturerName("Rocket Launcher Australia LLC");
        rocketFactory.setSize(100.0f);
        rocketFactory.setSpaceCenterName("Sydney");
        rocketFactory.setMaxVelocity(15000.0f);
        rocketFactory.setStartPower(80000.0f);

        Rocket rocket = rocketFactory.createRocket();
    }
}
