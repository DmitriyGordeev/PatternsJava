package creational.factory.extra;

public class Rocket {

    private float size;
    private int   stageNumber;
    private float startPower;
    private float maxVelocity;
    private String manufacturerName;
    private String spaceCenterName;
    private String destination;
    private String launchStartTime;

    public Rocket(float size,
                  int stageNumber,
                  float startPower,
                  float maxVelocity,
                  String manufacturerName,
                  String spaceCenterName,
                  String destination,
                  String launchStartTime) {

        this.size = size;
        this.stageNumber = stageNumber;
        this.startPower = startPower;
        this.maxVelocity = maxVelocity;
        this.manufacturerName = manufacturerName;
        this.spaceCenterName = spaceCenterName;
        this.destination = destination;
        this.launchStartTime = launchStartTime;
    }

}
