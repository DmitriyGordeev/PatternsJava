package creational.factory;

public class main {

    public static float wardEffect(Bolt bolt) {
        return 0.01f * bolt.damage * bolt.maxRange;
    }

    public static void main(String[] args) {

        BoltFactory wardFactory = new BoltFactory();
        wardFactory.setDamage(10.0f);
        wardFactory.setMaxRange(100);

        Bolt fireBolt = wardFactory.createFireBolt(10.0f, 12.0f);
        Bolt frostBolt = wardFactory.createFrostBolt(90.0f);

        float fireBoltEffect = wardEffect(fireBolt);
        float frostBoltEffect = wardEffect(frostBolt);
    }
}
