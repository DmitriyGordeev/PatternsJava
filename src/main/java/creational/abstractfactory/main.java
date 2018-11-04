package creational.abstractfactory;

public class main {

    public static void main(String[] args) {

        Player player = new Player();
        System.out.println("Player attacks without weapon = " + player.attack());

        WeaponFactory weaponFactory = new BowFactory();
        weaponFactory.setAttackSpeed(10.0f);
        weaponFactory.setDamage(190.6f);

        player.provideWeapon(weaponFactory);
        float playerDamage = player.attack();

    }
}
