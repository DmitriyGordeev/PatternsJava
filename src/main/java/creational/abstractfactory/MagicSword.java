package creational.abstractfactory;

public class MagicSword extends Sword {
    private float magicExplosion;

    public MagicSword(float magicExplosion, float damage, float attackSpeed) {
        super(damage, attackSpeed);
        this.magicExplosion = magicExplosion;
    }

    @Override
    public float attack() {
        return magicExplosion * 100.1f + damage * 9.0f * attackSpeed;
    }
}
