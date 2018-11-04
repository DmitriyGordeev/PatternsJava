package structural.bridge;

public class TurretBridge {

    public Turret turret;
    public TurretBridge(Turret turret) {
        this.turret = turret;
    }

    public float attack() {
        return this.turret.attack();
    }
}
