package structural.bridge;

public class Laser extends TurretGun {
    public Laser(float power, float reloadTime) {
        super(power, reloadTime);
    }

    @Override
    public float attack() {
        return power * 0.8f;
    }

    @Override
    public void reload() {
        System.out.println("Lasers are reloaded");
    }
}
