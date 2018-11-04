package creational.abstractfactory;

public class SwordFactory extends WeaponFactory {

    private float bleedEffect;

    public void setBleedEffect(float bleedEffect) {
        this.bleedEffect = bleedEffect;
    }

    @Override
    public Weapon createWeapon() {
        return new Sword(this.bleedEffect, this.damage, this.attackSpeed);
    }

    public Weapon createWeapon(float bleedEffect) {
        return new Sword(bleedEffect, this.damage, this.attackSpeed);
    }
}
