package creational.factory;

public class WardFactory {

    private float defense;
    private float duration;

    public WardFactory() {
        defense = 0.0f;
        duration = 0.0f;
    }

    public float getDefense() {
        return defense;
    }

    public float getDuration() {
        return duration;
    }

    public void setDefense(float defense) {
        this.defense = defense;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public Ward createFireWard(float igniteDamage, float igniteRange) {
        return new FireWard(igniteDamage, igniteRange, defense, duration);
    }

    public Ward createFrostWard(float freezeEffect) {
        return new FrostWard(freezeEffect, defense, duration);
    }
}
