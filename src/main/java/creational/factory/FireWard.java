package creational.factory;

public class FireWard extends Ward {
    private float igniteDamage;
    private float igniteRange;

    public FireWard(float igniteDamage, float igniteRange, float defense, float duration) {
        super(defense, duration);
        this.igniteDamage = igniteDamage;
        this.igniteRange  = igniteRange;
    }

    @Override
    public void collapse() {
        System.out.println("collapse damage around: " + duration * igniteRange);
    }
}
