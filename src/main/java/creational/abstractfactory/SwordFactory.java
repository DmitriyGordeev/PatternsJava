package creational.abstractfactory;

public class SwordFactory {
    float damage;
    float attackSpeed;

    public SwordFactory() {
        this.damage = 0.0f;
        this.attackSpeed = 0.0f;
    }

    public void setAttackSpeed(float attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public float getAttackSpeed() {
        return attackSpeed;
    }

    public float getDamage() {
        return damage;
    }

    public Sword createIronSword(float bleedEffect) {
        return new IronSword(bleedEffect, this.damage, this.attackSpeed);
    }

    public Sword createMagicSword(float magicExplosion) {
        return new MagicSword(magicExplosion, this.damage, this.attackSpeed);
    }

}
