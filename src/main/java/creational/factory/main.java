package creational.factory;

public class main {

    public static float wardEffect(Ward ward) {
        return 0.01f * ward.defense * ward.duration;
    }

    public static void main(String[] args) {

        WardFactory wardFactory = new WardFactory();
        wardFactory.setDefense(10.0f);
        wardFactory.setDuration(100);

        Ward fireWard = wardFactory.createFireWard(10.0f, 12.0f);
        Ward frostWard = wardFactory.createFrostWard(90.0f);

        float fireWardEffect = wardEffect(fireWard);
        float frostWardEffect = wardEffect(frostWard);
    }
}
