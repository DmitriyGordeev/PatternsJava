package creational.prototype;

public class main {
    public static void main(String[] args) {
        Rocket.Builder builder = new Rocket.Builder();
        builder.setDestination("Destination")
                .setLaunchStartTime("LaunchStartTime")
                .setManufacturerName("Australian Rockets LLC")
                .setMaxVelocity(100.0f)
                .setSpaceCenterName("Sydney Space Commands")
                .setSize(3)
                .setStageNumber(3)
                .setStartPower(100);

        Rocket rocket = builder.build();
        Rocket rocket2 = rocket.clone();

        boolean eq = (rocket == rocket2);
    }
}
