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
        return new Rocket(
                size,
                stageNumber,
                startPower,
                maxVelocity,
                manufacturerName,
                spaceCenterName,
                destination,
                launchStartTime);
    }
}