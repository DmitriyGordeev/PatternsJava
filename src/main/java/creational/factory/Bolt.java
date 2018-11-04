package creational.factory;

public abstract class Bolt {
    protected float damage;
    protected float maxRange;

    public Bolt(float damage, float maxRange) {
        this.damage = damage;
        this.maxRange = maxRange;
    }

    public abstract void collapse();
}
