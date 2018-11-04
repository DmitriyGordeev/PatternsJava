package creational.abstractfactory;

public class Player {
    private Weapon weapon;

    public void provideWeapon(WeaponFactory weaponFactory) {
        if(weaponFactory == null)
            return;

        if(weaponFactory instanceof SwordFactory) {
            ((SwordFactory) weaponFactory).setBleedEffect(19.0f);
            this.weapon = weaponFactory.createWeapon();
        }
        else if(weaponFactory instanceof BowFactory) {
            ((BowFactory) weaponFactory).setRange(129.0f);
            this.weapon = weaponFactory.createWeapon();
        }
    }

    public float attack() {
        if(weapon == null) {
            return 100.0f;
        }
        return weapon.attack();
    }
}
