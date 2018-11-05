package structural.decorator;

public class Arrow {

    private float damage;

    public Arrow(float damage) {
        this.damage = damage;
    }

    public float attack(float force) {
        return force * damage;
    }
}
