package creational.abstractfactory;

public class BowFactory extends WeaponFactory {

    private float range;

    public void setRange(float range) {
        this.range = range;
    }

    @Override
    public Weapon createWeapon() {
        return new Sword(this.range, this.damage, this.attackSpeed);
    }
}
