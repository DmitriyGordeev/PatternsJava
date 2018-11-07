package structural.proxy;

public class Thanos {

    private float power;

    public Thanos() {
        this.power = 1.0f;
    }

    public float attack() {
        return 100000.0f * power;
    }

    public boolean grip(Enemy enemy) {
        return enemy.takeDamage(190.0f * power);
    }

    public void setPower(float power) {
        this.power = power;
    }
}
