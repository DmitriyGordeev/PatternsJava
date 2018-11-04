package creational.factory;

public class FrostBolt extends Bolt {
    private float freezeEffect;

    public FrostBolt(float freezeEffect, float damage, float maxRange) {
        super(damage, maxRange);
        this.freezeEffect = freezeEffect;
    }

    @Override
    public void collapse() {
        System.out.println("collapse damage around: " + maxRange * freezeEffect + damage * 0.1f);
    }
}
