package structural.decorator;

public class FireArrow {

    private Arrow arrow;
    private float igniteEffect;

    public FireArrow(Arrow arrow, float igniteEffect) {
        this.arrow = arrow;
        this.igniteEffect = igniteEffect;
    }

    public float attack(float force) {
        float damage = arrow.attack(force);
        return damage * (1 + igniteEffect * 0.01f);
    }
}
