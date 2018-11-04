package structural.bridge;

public class Laser extends Turret {

    public Laser(float power) {
        super(power);
    }

    public float attack() {
        return power * 190.0f;
    }
}
