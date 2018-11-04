package creational.abstractfactory;

public abstract class Sword {
    float damage;
    float attackSpeed;

    public Sword(float damage, float attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public abstract float attack();

}
