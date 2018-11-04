package creational.abstractfactory;

public abstract class WeaponFactory {
    float damage;
    float attackSpeed;

    public WeaponFactory() {
        this.damage = 0.0f;
        this.attackSpeed = 0.0f;
    }

    public WeaponFactory(float damage, float attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public void setAttackSpeed(float attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public float getDamage() {
        return damage;
    }

    public float getAttackSpeed() {
        return attackSpeed;
    }

    public abstract Weapon createWeapon();
}
