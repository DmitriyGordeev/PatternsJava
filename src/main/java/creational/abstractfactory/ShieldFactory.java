package creational.abstractfactory;

public class ShieldFactory {
    float defense;
    float durability;

    public ShieldFactory() {
        this.defense = 0.0f;
        this.durability = 0.0f;
    }

    public void setDefense(float defense) {
        this.defense = defense;
    }

    public void setDurability(float durability) {
        this.durability = durability;
    }

    public float getDefense() {
        return defense;
    }

    public float getDurability() {
        return durability;
    }

    public Shield createIronShield(float reflectForce) {
        return new IronShield(reflectForce, this.defense, this.durability);
    }

    public Shield createMagicShield(float magicDamage) {
        return new MagicShield(magicDamage, this.defense, this.durability);
    }
}

