package structural.proxy;

public class main {
    public static void main(String[] args) {

        Thanos thanos = new Thanos();

        Enemy enemy = new Enemy();

        boolean enemyAlive = thanos.grip(enemy);

        AstralThanos astralThanos = new AstralThanos();
        Enemy groot = new Enemy();

        boolean grootIsAlive = astralThanos.grip(groot);
        System.out.println("groot is alive : " + grootIsAlive);

    }
}
