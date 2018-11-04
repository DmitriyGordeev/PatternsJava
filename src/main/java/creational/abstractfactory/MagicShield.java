package creational.abstractfactory;

public class MagicShield extends Shield {
    private float magicDamage;

    public MagicShield(float magicDamage, float defense, float durability) {
        super(defense, durability);
        this.magicDamage = magicDamage;
    }

    @Override
    public float reflect(float damage) {
        return 0.9f * magicDamage * defense * 0.01f * durability;
    }
}
