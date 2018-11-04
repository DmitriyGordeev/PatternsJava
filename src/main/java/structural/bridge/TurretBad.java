package structural.bridge;

public class TurretBad {

    private float power;
    private int typeOfWeapon;
    private float speed;
    private boolean flyEnabled;
    private int typeOfShield;
    private float defense;

    public TurretBad(float power,
                     int typeOfWeapon,
                     float speed,
                     boolean flyEnabled,
                     int typeOfShield,
                     float defense) {
        this.power = power;
        this.typeOfWeapon = typeOfWeapon;
        this.speed = speed;
        this.flyEnabled = flyEnabled;
        this.typeOfShield = typeOfShield;
        this.defense = defense;
    }

    private float attack() {
        if(typeOfWeapon == 0) {
            return power;
        }
        else if(typeOfWeapon == 1) {
            return power * 2.3f;
        }
        else if(typeOfWeapon == 3) {
            return power * 3.1f + 0.01f;
        }
        else
            return 0.0f;
    }
    private void moveToPos(float x, float y) {

    }
    private void enableDefense() {

    }
}
