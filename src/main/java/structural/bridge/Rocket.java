package structural.bridge;

public class Rocket extends Turret {

    public Rocket(float power) {
        super(power);
    }

    public float attack() {
        return power * 1.0f + 12.0f;
    }
}
