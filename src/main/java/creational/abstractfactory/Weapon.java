package creational.abstractfactory;

public abstract class Weapon {

    float damage;
    float attackSpeed;

    public Weapon(float damage, float attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public abstract float attack();
}
