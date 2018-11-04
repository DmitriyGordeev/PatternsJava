package creational.factory;

public class FireBolt extends Bolt {
    private float igniteDamage;
    private float igniteRange;

    public FireBolt(float igniteDamage, float igniteRange, float damage, float maxRange) {
        super(damage, maxRange);
        this.igniteDamage = igniteDamage;
        this.igniteRange  = igniteRange;
    }

    @Override
    public void collapse() {
        System.out.println("collapse damage around: " + maxRange * igniteRange);
    }
}
