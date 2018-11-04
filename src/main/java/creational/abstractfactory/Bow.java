package creational.abstractfactory;

public class Bow extends Weapon {

    float range;

    public Bow(float range, float damage, float attackSpeed) {
        super(damage, attackSpeed);
        this.range = range;
    }

    @Override
    public float attack() {
        return range * damage * attackSpeed;
    }
}
