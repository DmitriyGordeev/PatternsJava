package creational.abstractfactory;

public class main {
    public static void main(String[] args) {

        ShieldFactory shieldFactory = new ShieldFactory();
        shieldFactory.setDefense(100.0f);
        shieldFactory.setDurability(90.0f);

        Shield ironShield = shieldFactory.createIronShield(150.9f);
        Shield magicShield = shieldFactory.createMagicShield(78.0f);

        SwordFactory swordFactory = new SwordFactory();
        swordFactory.setAttackSpeed(190.8f);
        swordFactory.setDamage(45.0f);

        Sword ironSword = swordFactory.createIronSword(16.0f);
        Sword magicSword = swordFactory.createMagicSword(8100.0f);

    }
}
