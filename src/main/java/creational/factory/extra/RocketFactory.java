package creational.factory.extra;

public class RocketFactory {

    private float size;
    private int   stageNumber;
    private float startPower;
    private float maxVelocity;
    private String manufacturerName;
    private String spaceCenterName;
    private String destination;
    private String launchStartTime;

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setLaunchStartTime(String launchStartTime) {
        this.launchStartTime = launchStartTime;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public void setMaxVelocity(float maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void setSpaceCenterName(String spaceCenterName) {
        this.spaceCenterName = spaceCenterName;
    }

    public void setStageNumber(int stageNumber) {
        this.stageNumber = stageNumber;
    }

    public void setStartPower(float startPower) {
        this.startPower = startPower;
    }

    public Rocket createRocket() {
        Rocket.Builder builder = new Rocket.Builder();
        builder.setDestination(this.destination)
                .setLaunchStartTime(this.launchStartTime)
                .setManufacturerName(this.manufacturerName)
                .setMaxVelocity(this.maxVelocity)
                .setSpaceCenterName(this.spaceCenterName)
                .setSize(this.size)
                .setStageNumber(this.stageNumber)
                .setStartPower(this.startPower);

        return builder.build();
    }

    public Rocket createRussianRocketFiveStage(String destination, String launchStartTime) {
        Rocket.Builder builder = new Rocket.Builder();
        builder.setDestination(destination)
                .setLaunchStartTime(launchStartTime)
                .setManufacturerName("Manufacturer")
                .setMaxVelocity(this.maxVelocity)
                .setSpaceCenterName("Plesetsk")
                .setSize(this.size)
                .setStageNumber(5)
                .setStartPower(this.startPower);

        return builder.build();
    }

    public Rocket createAustralianRocket(int stageNumber, String destination, String launchStartTime) {
        Rocket.Builder builder = new Rocket.Builder();
        builder.setDestination(destination)
                .setLaunchStartTime(launchStartTime)
                .setManufacturerName("Australian Rockets LLC")
                .setMaxVelocity(this.maxVelocity)
                .setSpaceCenterName("Sydney Space Commands")
                .setSize(this.size)
                .setStageNumber(stageNumber)
                .setStartPower(this.startPower);

        return builder.build();
    }
}
