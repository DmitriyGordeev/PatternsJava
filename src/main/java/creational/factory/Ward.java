package creational.factory;

public abstract class Ward {
    protected float defense;
    protected float duration;

    public Ward(float defense, float duration) {}

    public abstract void collapse();
}
