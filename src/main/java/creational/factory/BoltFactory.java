package creational.factory;

public class BoltFactory {

    private float damage;
    private float maxRange;

    public BoltFactory() {
        damage = 0.0f;
        maxRange = 0.0f;
    }

    public float getDamage() {
        return damage;
    }

    public float getMaxRange() {
        return maxRange;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public void setMaxRange(float maxRange) {
        this.maxRange = maxRange;
    }

    public Bolt createFireBolt(float igniteDamage, float igniteRange) {
        return new FireBolt(igniteDamage, igniteRange, this.damage, this.maxRange);
    }

    public Bolt createFrostBolt(float freezeEffect) {
        return new FrostBolt(freezeEffect, this.damage, this.maxRange);
    }
}
