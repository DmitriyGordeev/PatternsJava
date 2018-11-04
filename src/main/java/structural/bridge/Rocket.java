package structural.bridge;

public class Rocket extends TurretGun {
    public Rocket(float power, float reloadTime) {
        super(power, reloadTime);
    }

    @Override
    public float attack() {
        return power * 1.2f;
    }

    @Override
    public void reload() {
        System.out.println("Rockets are reloaded");
    }
}
