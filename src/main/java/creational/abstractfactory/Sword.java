package creational.abstractfactory;

public class Sword extends Weapon {

    float bleedEffect;

    public Sword(float bleedEffect, float damage, float attackSpeed) {
        super(damage, attackSpeed);
        this.bleedEffect = bleedEffect;
    }

    @Override
    public float attack() {
        return 1000 * bleedEffect + damage * attackSpeed;
    }
}
