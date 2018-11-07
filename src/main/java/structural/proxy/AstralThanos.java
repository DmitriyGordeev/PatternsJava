package structural.proxy;

public class AstralThanos {
    public Thanos thanos;

    public AstralThanos() {
        thanos = new Thanos();
        thanos.setPower(0.1f);
    }

    public float attack() {
        System.out.println("Thanos attacking!");
        return thanos.attack();
    }

    public boolean grip(Enemy enemy) {
        System.out.println("Thanos doing grip!");
        return thanos.grip(enemy);
    }

    public void setPower(float power) {
        this.thanos.setPower(power);
    }
}
