package creational.factory;

public class FrostWard extends Ward {
    private float freezeEffect;

    public FrostWard(float freezeEffect, float defense, float duration) {
        super(defense, duration);
        this.freezeEffect = freezeEffect;
    }

    @Override
    public void collapse() {
        System.out.println("collapse damage around: " + duration * freezeEffect + defense * 0.1f);
    }
}
