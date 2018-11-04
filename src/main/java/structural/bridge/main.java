package structural.bridge;

public class main {
    public static void main(String[] args) {
        TurretBridge turretBridge = new TurretBridge(new Laser(100.0f));
        float rocketAttack = turretBridge.attack();
    }
}
