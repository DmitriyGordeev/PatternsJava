package creational.prototype;

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

    public static class Builder {
        private float size;
        private int   stageNumber;
        private float startPower;
        private float maxVelocity;
        private String manufacturerName;
        private String spaceCenterName;
        private String destination;
        private String launchStartTime;

        public Builder setStartPower(float startPower) {
            this.startPower = startPower;
            return this;
        }

        public Builder setStageNumber(int stageNumber) {
            this.stageNumber = stageNumber;
            return this;
        }

        public Builder setSpaceCenterName(String spaceCenterName) {
            this.spaceCenterName = spaceCenterName;
            return this;
        }

        public Builder setSize(float size) {
            this.size = size;
            return this;
        }

        public Builder setMaxVelocity(float maxVelocity) {
            this.maxVelocity = maxVelocity;
            return this;
        }

        public Builder setManufacturerName(String manufacturerName) {
            this.manufacturerName = manufacturerName;
            return this;
        }

        public Builder setLaunchStartTime(String launchStartTime) {
            this.launchStartTime = launchStartTime;
            return this;
        }

        public Builder setDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public Rocket build() {
            return new Rocket(
                    this.size,
                    this.stageNumber,
                    this.startPower,
                    this.maxVelocity,
                    this.manufacturerName,
                    this.spaceCenterName,
                    this.destination,
                    this.launchStartTime);
        }
    }

    public Rocket clone() {
        Rocket output = new Rocket(
                this.size,
                this.stageNumber,
                this.startPower,
                this.maxVelocity,
                this.manufacturerName,
                this.spaceCenterName,
                this.destination,
                this.launchStartTime
        );
        return output;
    }

}
