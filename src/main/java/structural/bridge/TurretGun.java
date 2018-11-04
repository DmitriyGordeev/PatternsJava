package structural.bridge;

public abstract class TurretGun {
    public float power;
    public float reloadTime;

    public TurretGun(float power, float reloadTime) {
        this.power = power;
        this.reloadTime = reloadTime;
    }

    public abstract float attack();

    public abstract void reload();
}
