package structural.bridge;

public abstract class Turret {
    public float power;

    public Turret(float power) {
        this.power = power;
    }

    public abstract float attack();
}
