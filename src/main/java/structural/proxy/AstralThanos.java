package structural.proxy;

public class AstralThanos {
    public Thanos thanos;

    public AstralThanos() {
        thanos = new Thanos();
        thanos.setPower(0.1f);
    }

    public float attack() {
        return thanos.attack();
    }

    public boolean grip(Enemy enemy) {
        return thanos.grip(enemy);
    }

    public void setPower(float power) {
        this.thanos.setPower(power);
    }
}
