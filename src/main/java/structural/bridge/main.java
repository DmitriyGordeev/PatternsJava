package structural.bridge;

public class main {
    public static void main(String[] args) {
        Turret turret = new Turret(new Rocket(100, 90.0f));
        float damage = turret.attack();
        turret.reload();

        turret.setMainGun(new Laser(900.0f, 150.0f));
        damage = turret.attack();
        turret.reload();
    }
}
