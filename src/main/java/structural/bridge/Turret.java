package structural.bridge;

public class Turret {

    public TurretGun mainGun;

    public Turret(TurretGun mainGun) {
        this.mainGun = mainGun;
    }

    public float attack() {
        return this.mainGun.attack();
    }

    public void reload() {
        this.mainGun.reload();
    }

    public void setMainGun(TurretGun mainGun) {
        this.mainGun = mainGun;
    }

    public TurretGun getMainGun() {
        return mainGun;
    }
}
