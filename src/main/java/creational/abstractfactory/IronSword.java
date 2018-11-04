package creational.abstractfactory;

public class IronSword extends Sword {

    private float bleedEffect;

    public IronSword(float bleedEffect, float damage, float attackSpeed) {
        super(damage, attackSpeed);
        this.bleedEffect = bleedEffect;
    }

    @Override
    public float attack() {
        return bleedEffect * 100.1f + damage * 9.0f * attackSpeed;
    }
}
